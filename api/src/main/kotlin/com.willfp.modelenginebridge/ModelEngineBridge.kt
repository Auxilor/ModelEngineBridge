package com.willfp.modelenginebridge

import org.bukkit.Bukkit
import org.bukkit.entity.Entity
import java.util.UUID

interface ModelEngineBridge {
    fun createActiveModel(id: String): BridgedActiveModel?

    fun createModeledEntity(entity: Entity): BridgedModeledEntity

    fun getModeledEntity(entity: Entity): BridgedModeledEntity? {
        return getModeledEntity(entity.uniqueId)
    }

    fun getModeledEntity(uuid: UUID): BridgedModeledEntity?

    companion object {
        val instance: ModelEngineBridge = createInstance()

        private fun createInstance(): ModelEngineBridge {
            val plugin = Bukkit.getPluginManager().getPlugin("ModelEngine")
                ?: throw IllegalStateException("ModelEngineBridge requires ModelEngine to be installed.")

            @Suppress("DEPRECATION")
            val version = plugin.description.version

            return if (version.startsWith("R3")) {
                val clazz = Class.forName("com.willfp.modelenginebridge.v3.ModelEngineBridgeV3")
                clazz.constructors[0].newInstance() as ModelEngineBridge
            } else if (version.startsWith("R4")) {
                val clazz = Class.forName("com.willfp.modelenginebridge.v4.ModelEngineBridgeV4")
                clazz.constructors[0].newInstance() as ModelEngineBridge
            } else {
                throw IllegalStateException("ModelEngineBridge requires version 3 or 4 of Model Engine!")
            }
        }
    }
}
