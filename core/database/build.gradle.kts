plugins {
    alias(libs.plugins.tracknplan.android.library)
    alias(libs.plugins.tracknplan.android.room)
    alias(libs.plugins.tracknplan.hilt)
}

android {
    namespace = "com.tkapplications.core.database"
}

dependencies {
    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.kotlinx.coroutines.test)
}