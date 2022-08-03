package com.github.romann44.ideatemplate.services

import com.intellij.openapi.project.Project
import com.github.romann44.ideatemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
