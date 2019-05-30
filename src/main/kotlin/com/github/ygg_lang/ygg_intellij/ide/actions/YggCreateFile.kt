package com.github.ygg_lang.ygg_intellij.ide.actions

import com.github.ygg_lang.ygg_intellij.ide.icons.YggIconProvider
import com.github.ygg_lang.ygg_intellij.language.YggBundle
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class YggCreateFile : CreateFileFromTemplateAction(NAME, YggBundle.message("filetype.voml.create.description"), YggIconProvider.FILE) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle(NAME)
            .addKind("Empty file", YggIconProvider.FILE, "Voml File")
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = NAME

    companion object {
        private val NAME = YggBundle.message("filetype.voml.create")
    }
}
