package com.willfp.modelenginebridge.v3

import com.ticxo.modelengine.api.ModelEngineAPI
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedModeledEntity
import com.willfp.modelenginebridge.ModelEngineBridge
import com.willfp.modelenginebridge.v3.impl.V3ActiveModel
import com.willfp.modelenginebridge.v3.impl.V3ModeledEntity
import org.bukkit.entity.Entity

class ModelEngineBridgeV3 : ModelEngineBridge {
    override fun createActiveModel(id: String): BridgedActiveModel? {
        val model = ModelEngineAPI.createActiveModel(id) ?: return null

        return V3ActiveModel(id, model)
    }

    override fun createModeledEntity(entity: Entity): BridgedModeledEntity {
        return V3ModeledEntity(ModelEngineAPI.createModeledEntity(entity))
    }
}
