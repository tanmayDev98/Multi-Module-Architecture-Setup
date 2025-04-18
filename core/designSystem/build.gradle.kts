plugins {
    alias(libs.plugins.tracknplan.android.library)
}

android {
    namespace = "com.tkapplications.core.designsystem"
}

dependencies {
    api(libs.androidx.material3)
    api(libs.androidx.compose.runtime)

    testImplementation(libs.hilt.android.testing)
}