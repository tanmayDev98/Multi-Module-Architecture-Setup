plugins {
    alias(libs.plugins.tracknplan.android.library)
}

android {
    namespace = "com.tkapplications.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.test)
}