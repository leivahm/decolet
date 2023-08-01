fun main() {
    println(substract(10,5))
}

fun substract(firstnro: Int = 8, secondnro: Int = 6): String {
    val primero = "El primer número es: $firstnro"
    val segundo = "el segundo número es: $secondnro"
	val resultado = firstnro - secondnro
    return "$primero y $segundo\nLa resta de ellos da: $resultado"
}