package project.sairenity.data

data class PMResult(
    val pm10:Int,
    val pm25:Int,
    val connectionState: ConnectionState
)
