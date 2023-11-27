package com.willfp.modelenginebridge

interface BridgedModeledEntity {
    var isBaseEntityVisible: Boolean

    fun addModel(model: BridgedActiveModel)

    fun removeModel(model: BridgedActiveModel)
}
