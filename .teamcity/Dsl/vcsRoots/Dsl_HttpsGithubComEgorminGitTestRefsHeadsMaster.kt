package Dsl.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster : GitVcsRoot({
    uuid = "90bfeac4-27bf-4f74-ac52-c3798a6eaa71"
    id = "Dsl_HttpsGithubComEgorminGitTestRefsHeadsMaster"
    name = "https://github.com/egormin/git_test#refs/heads/master"
    url = "https://github.com/egormin/git_test"
    authMethod = password {
        userName = "egormin"
        password = "credentialsJSON:ba9f4752-e382-4b45-913f-ba47d936d466"
    }
})
