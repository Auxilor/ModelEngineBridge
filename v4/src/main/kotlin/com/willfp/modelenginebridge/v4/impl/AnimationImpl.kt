package com.willfp.modelenginebridge.v4.impl

import com.ticxo.modelengine.api.animation.property.IAnimationProperty
import com.willfp.modelenginebridge.BridgedAnimation

class AnimationImpl(
    val handle: IAnimationProperty
): BridgedAnimation {
    override val name: String = handle.name
}
