plugins {
    alias(libs.plugins.tracknplan.android.library)
    alias(libs.plugins.tracknplan.hilt)
}

android {
    namespace = "com.tkapplications.core.notifications"
}

dependencies {
    compileOnly(platform(libs.androidx.compose.bom))
}