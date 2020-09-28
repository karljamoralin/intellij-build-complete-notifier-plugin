package com.github.karljamoralin.intellijbuildcompletenotifierplugin.services

import com.intellij.openapi.project.Project
import com.github.karljamoralin.intellijbuildcompletenotifierplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
