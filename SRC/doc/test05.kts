fun main() {
    val trip1: Double = 5.20 // Aquí la variable se define apropiadamente
    val trip2 = 4.10    // Aquí la variable se define por inferencia de tipo
    val trip3 = 1.72    // Aquí también se define por inferencia de tipo
    val totalTripLength: Double = trip1 + trip2 + trip3 // Aquí tmb se define la variable apropiadamente
    println("$totalTripLength miles left to destination")
}