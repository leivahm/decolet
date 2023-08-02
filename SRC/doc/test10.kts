fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    val bandera: Boolean
    bandera = useCompare(timeSpentToday, timeSpentYesterday)
    println("Did I use my phone today more than yesterday?\n$bandera")
}

fun useCompare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}