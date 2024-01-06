package com.willfp.modelenginebridge.v4.impl

import com.ticxo.modelengine.api.model.ModeledEntity
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedModeledEntity

class ModeledEntityImpl(
    val handle: ModeledEntity
) : BridgedModeledEntity {
    override var isBaseEntityVisible: Boolean
        get() = handle.isBaseEntityVisible
        set(value) {
            handle.isBaseEntityVisible = value
        }

    override val models: Map<String, BridgedActiveModel>
        get() = handle.models.mapValues { ActiveModelImpl(it.key, it.value) }

    override fun addModel(model: BridgedActiveModel) {
        model as ActiveModelImpl

        handle.addModel(model.handle, true)
    }

    override fun removeModel(model: BridgedActiveModel) {
        model as ActiveModelImpl

        handle.removeModel(model.id)
    }
}

