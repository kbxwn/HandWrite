pluginManagement {
    repositories {

        maven("https://maven.aliyun.com/repository/google")
        maven("https://jitpack.io")
        maven("https://developer.huawei.com/repo/")

        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        maven("https://maven.aliyun.com/repository/google")
        maven("https://jitpack.io")
        maven("https://developer.huawei.com/repo/")

        google()
        mavenCentral()
    }
}

rootProject.name = "HandWrite"
include(":app")
include(":libSignature")