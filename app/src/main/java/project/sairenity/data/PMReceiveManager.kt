package project.sairenity.data

import kotlinx.coroutines.flow.MutableSharedFlow
import project.sairenity.util.Resource

interface PMReceiveManager {
    val data: MutableSharedFlow<Resource<PMResult>>

    fun reconnect()

    fun disconnect()

    fun startReceiving()

    fun closeConnection()
}