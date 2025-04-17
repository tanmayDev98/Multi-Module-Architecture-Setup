pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Track N Plan"
include(":app")
include(":core")
include(":core:designSystem")
include(":core:database")
include(":core:model")
include(":core:network")
include(":core:analytics")
include(":core:testing")
include(":core:notifications")
include(":core:ui")
include(":core:common")
include(":feature")
include(":feature:home")
include(":feature:add")
include(":feature:settings")
include(":feature:goals")
include(":feature:excercises")
include(":feature:schedule")
include(":core:data")
