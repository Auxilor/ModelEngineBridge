package com.willfp.modelenginebridge.v4.impl

import com.ticxo.modelengine.api.model.ActiveModel
import com.willfp.modelenginebridge.BridgedActiveModel

class V4ActiveModel(
    override val id: String,
    val handle: ActiveModel
) : BridgedActiveModel
