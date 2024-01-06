package com.willfp.modelenginebridge

interface BridgedAnimationHandler {
    val model: BridgedActiveModel

    fun getAnimation(name: String): BridgedAnimation?

    fun playAnimation(animation: BridgedAnimation, force: Boolean)
}
