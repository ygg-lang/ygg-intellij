package com.github.ygg_lang.ygg_intellij.language

import com.github.ygg_lang.ygg_intellij.language.YggLanguage.Companion.BundlePath
import com.intellij.DynamicBundle
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.PropertyKey
import java.util.function.Supplier

object YggBundle : DynamicBundle(BundlePath) {

    @Nls
    fun message(@PropertyKey(resourceBundle = BundlePath) key: String, vararg params: Any): String {
        return getMessage(key, *params)
    }

    fun messagePointer(@PropertyKey(resourceBundle = BundlePath) key: String, vararg params: Any): Supplier<String> {
        return getLazyMessage(key, *params)
    }
}