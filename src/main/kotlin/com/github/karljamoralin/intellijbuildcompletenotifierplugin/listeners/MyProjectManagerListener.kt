package com.github.karljamoralin.intellijbuildcompletenotifierplugin.listeners

import com.intellij.build.BuildProgressListener
import com.intellij.build.events.BuildEvent

internal class MyProjectManagerListener : BuildProgressListener {
    override fun onEvent(buildId: Any, event: BuildEvent) {
        println(event.toString())
    }

//    override fun projectOpened(project: Project) {
//        project.getService(MyProjectService::class.java)
//    }
}
