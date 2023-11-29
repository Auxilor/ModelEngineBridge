package com.willfp.modelenginebridge

interface BridgedModeledEntity {
    var isBaseEntityVisible: Boolean

    val models: Map<String, BridgedActiveModel>

    fun addModel(model: BridgedActiveModel)

    fun removeModel(model: BridgedActiveModel)
}
