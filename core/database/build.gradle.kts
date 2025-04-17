plugins {
    alias(libs.plugins.tracknplan.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.tkapplications.core.database"
}

dependencies {
    androidTestImplementation(libs.androidx.test.core)
}