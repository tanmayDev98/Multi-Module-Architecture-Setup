import com.android.build.api.dsl.ApplicationExtension
import com.tkapplications.build_logic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

//Added this for test options
@Suppress("UnstableApiUsage")
class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.application")
            apply(plugin = "org.jetbrains.kotlin.plugin.compose")

            val extension = extensions.getByType<ApplicationExtension>()
            extension.apply {
                buildFeatures {
                    compose = true
                }

                dependencies {
                    val bom = libs.findLibrary("androidx-compose-bom").get()
                    "implementation"(platform(bom))
                    "androidTestImplementation"(platform(bom))
                    "implementation"(libs.findLibrary("androidx-ui-tooling-preview").get())
                    "debugImplementation"(libs.findLibrary("androidx-ui-tooling").get())
                }

                testOptions {
                    unitTests {
                        isIncludeAndroidResources = true
                    }
                }
            }
        }
    }
}