import com.android.build.gradle.LibraryExtension
import com.tkapplications.build_logic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.library")
            apply(plugin = "org.jetbrains.kotlin.plugin.compose")

            val extension = extensions.getByType<LibraryExtension>()
            extension.apply {
                buildFeatures {
                    compose = true
                }

                dependencies {
                    val bom = libs.findLibrary("androidx-compose-bom").get()
                    "implementation"(platform(bom))
                    "androidTestImplementation"(platform(bom))
                    "implementation"(libs.findLibrary("androidx-compose-ui-tooling-preview").get())
                    "debugImplementation"(libs.findLibrary("androidx-compose-ui-tooling").get())
                }

                testOptions {
                    unitTests {
                        // For Robolectric
                        isIncludeAndroidResources = true
                    }
                }
            }
        }
    }
}
