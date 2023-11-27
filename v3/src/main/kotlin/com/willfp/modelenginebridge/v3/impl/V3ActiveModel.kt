package com.willfp.modelenginebridge.v3.impl

import com.ticxo.modelengine.api.model.ActiveModel
import com.willfp.modelenginebridge.BridgedActiveModel

class V3ActiveModel(
    override val id: String,
    val handle: ActiveModel
) : BridgedActiveModel
