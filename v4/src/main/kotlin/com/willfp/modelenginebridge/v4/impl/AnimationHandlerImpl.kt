package com.willfp.modelenginebridge.v4.impl

import com.ticxo.modelengine.api.animation.handler.AnimationHandler
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedAnimation
import com.willfp.modelenginebridge.BridgedAnimationHandler

class AnimationHandlerImpl(
    val handle: AnimationHandler,
    override val model: BridgedActiveModel
): BridgedAnimationHandler {
    override fun getAnimation(name: String): BridgedAnimation? {
        val animation = handle.getAnimation(name) ?: return null
        return AnimationImpl(animation)
    }

    override fun playAnimation(animation: BridgedAnimation, force: Boolean) {
        animation as AnimationImpl
        
        handle.playAnimation(animation.handle, force)
    }
}
