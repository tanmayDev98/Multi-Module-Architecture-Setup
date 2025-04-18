plugins {
    alias(libs.plugins.tracknplan.android.library)
    alias(libs.plugins.tracknplan.android.lib.compose)
    alias(libs.plugins.tracknplan.hilt)
}

android {
    namespace = "com.tkapplications.core.analytics"
}

dependencies {
    implementation(libs.androidx.compose.runtime)
}