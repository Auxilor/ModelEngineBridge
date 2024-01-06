package com.willfp.modelenginebridge.v4

import com.ticxo.modelengine.api.ModelEngineAPI
import com.willfp.modelenginebridge.BridgedActiveModel
import com.willfp.modelenginebridge.BridgedModeledEntity
import com.willfp.modelenginebridge.ModelEngineBridge
import com.willfp.modelenginebridge.v4.impl.ActiveModelImpl
import com.willfp.modelenginebridge.v4.impl.ModeledEntityImpl
import org.bukkit.entity.Entity
import java.util.UUID

class ModelEnginePlatform : ModelEngineBridge {
    override fun createActiveModel(id: String): BridgedActiveModel? {
        val model = ModelEngineAPI.createActiveModel(id) ?: return null

        return ActiveModelImpl(id, model)
    }

    override fun createModeledEntity(entity: Entity): BridgedModeledEntity {
        return ModeledEntityImpl(ModelEngineAPI.createModeledEntity(entity))
    }

    override fun getModeledEntity(uuid: UUID): BridgedModeledEntity? {
        return ModelEngineAPI.getModeledEntity(uuid)?.let { ModeledEntityImpl(it) }
    }
}
