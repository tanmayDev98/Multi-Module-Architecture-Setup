plugins {
    alias(libs.plugins.multimodularsetup.jvm.library)
    alias(libs.plugins.multimodularsetup.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.test)
}