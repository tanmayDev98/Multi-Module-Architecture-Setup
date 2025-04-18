plugins {
    alias(libs.plugins.tracknplan.android.library)
    alias(libs.plugins.tracknplan.hilt)
}

android {
    namespace = "com.tkapplications.core.data"
}

dependencies {
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.kotlinx.serialization.json)
}