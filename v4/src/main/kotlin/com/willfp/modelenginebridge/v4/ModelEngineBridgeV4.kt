package com.willfp.modelenginebridge.v4

import com.ticxo.modelengine.api.ModelEngineAPI
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedModeledEntity
import com.willfp.modelenginebridge.ModelEngineBridge
import com.willfp.modelenginebridge.v4.impl.V4ActiveModel
import com.willfp.modelenginebridge.v4.impl.V4ModeledEntity
import org.bukkit.entity.Entity
import java.util.UUID

class ModelEngineBridgeV4 : ModelEngineBridge {
    override fun createActiveModel(id: String): BridgedActiveModel? {
        val model = ModelEngineAPI.createActiveModel(id) ?: return null

        return V4ActiveModel(id, model)
    }

    override fun createModeledEntity(entity: Entity): BridgedModeledEntity {
        return V4ModeledEntity(ModelEngineAPI.createModeledEntity(entity))
    }

    override fun getModeledEntity(uuid: UUID): BridgedModeledEntity? {
        return ModelEngineAPI.getModeledEntity(uuid)?.let { V4ModeledEntity(it) }
    }
}
