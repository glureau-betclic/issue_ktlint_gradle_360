package com.glureau.custom_rules

import com.pinterest.ktlint.core.Rule
import com.pinterest.ktlint.core.RuleSet
import com.pinterest.ktlint.core.RuleSetProvider
import org.jetbrains.kotlin.com.intellij.lang.ASTNode

class MyRuleSetProvider : RuleSetProvider {
    override fun get() = RuleSet("ktlint-generics-in-html-report", MyRule())
}

class MyRule : Rule("my-rule") {
    override fun visit(
        node: ASTNode,
        autoCorrect: Boolean,
        emit: (offset: Int, errorMessage: String, canBeAutoCorrected: Boolean) -> Unit
    ) {
        emit(
            1,
            "Error message contains a generic type like List<Int> (should have displayed List&lt;Int&gt;)",
            false
        )
    }
}