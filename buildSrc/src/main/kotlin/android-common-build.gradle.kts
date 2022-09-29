plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        testInstrumentationRunner = AppConfig.androidTestInstrumentation
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        resources.excludes.add("META-INF/*")
        resources.excludes.add("**/attach_hotspot_windows.dll")
    }
}

dependencies{
    testImplementation(Libs.jUnitLibrary)
    androidTestImplementation(Libs.androidxTestRunnerLibrary)
    androidTestImplementation(Libs.androidxTestCoreLibrary)
}
