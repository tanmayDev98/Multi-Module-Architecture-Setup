plugins {
    alias(libs.plugins.tracknplan.android.library)
}

android {
    namespace = "com.tkapplications.core.analytics"
}

dependencies {
    implementation(libs.androidx.compose.runtime)
}