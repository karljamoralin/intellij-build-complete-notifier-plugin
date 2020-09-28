package com.github.karljamoralin.intellijbuildcompletenotifierplugin.services

import com.github.karljamoralin.intellijbuildcompletenotifierplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
