package OpenSourceProjects_Storybook.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with uuid = 'dc66f07a-281f-4434-97ca-f1480b7cfc51' (id = 'OpenSourceProjects_Storybook_SBNext')
in the project with uuid = '69382d9b-7791-418a-9ff6-1c83b86ed6b5' and delete the patch script.
*/
create("69382d9b-7791-418a-9ff6-1c83b86ed6b5", BuildType({
    uuid = "dc66f07a-281f-4434-97ca-f1480b7cfc51"
    id = "OpenSourceProjects_Storybook_SBNext"
    name = "SBNext"

    vcs {
        root("OpenSourceProjects_Storybook_SBNext")

    }

    steps {
        script {
            name = "Install"
            scriptContent = "yarn"
            dockerImage = "node:latest"
        }
        script {
            name = "Lint"
            scriptContent = "yarn lint"
            dockerImage = "node:latest"
        }
        script {
            name = "Test"
            scriptContent = "yarn test"
            dockerImage = "node:latest"
        }
        script {
            name = "Build"
            workingDir = "server"
            scriptContent = "yarn build"
            dockerImage = "node:latest"
        }
        script {
            name = "Build (1)"
            workingDir = "server"
            scriptContent = "yarn build"
            dockerImage = "node:latest"
        }
    }

    triggers {
        vcs {
        }
    }
}))

