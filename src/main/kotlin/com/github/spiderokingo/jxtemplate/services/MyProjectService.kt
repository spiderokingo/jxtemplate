package com.github.spiderokingo.jxtemplate.services

import com.github.spiderokingo.jxtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
