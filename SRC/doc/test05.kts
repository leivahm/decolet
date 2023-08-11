fun main() {
    val trip1: Double = 5.20 // Aquí la variable se define apropiadamente
    val trip2 = 4.10    // Aquí la variable se define por inferencia de tipo
    val trip3 = 1.72    // Aquí también
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}