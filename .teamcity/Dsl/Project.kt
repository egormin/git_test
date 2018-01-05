package Dsl

import Dsl.buildTypes.*
import Dsl.vcsRoots.*
import Dsl.vcsRoots.Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "ac273e87-27c3-453f-b5c3-8c7672c3933e"
    id = "Dsl"
    parentId = "_Root"
    name = "DSL"

    vcsRoot(Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster)

    buildType(Dsl_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_6"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
