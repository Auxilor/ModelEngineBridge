package com.willfp.modelenginebridge.v3.impl

import com.ticxo.modelengine.api.model.ModeledEntity
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedModeledEntity

class V3ModeledEntity(
    val handle: ModeledEntity
) : BridgedModeledEntity {
    override var isBaseEntityVisible: Boolean
        get() = handle.isBaseEntityVisible
        set(value) {
            handle.isBaseEntityVisible = value
        }

    override fun addModel(model: BridgedActiveModel) {
        model as V3ActiveModel

        handle.addModel(model.handle, true)
    }

    override fun removeModel(model: BridgedActiveModel) {
        model as V3ActiveModel

        handle.removeModel(model.id)
    }
}

