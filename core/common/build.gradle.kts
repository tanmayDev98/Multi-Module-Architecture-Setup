plugins {
    alias(libs.plugins.tracknplan.jvm.library)
    alias(libs.plugins.tracknplan.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.test)
}