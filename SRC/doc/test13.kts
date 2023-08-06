fun main() {
    pr("Ey, hola!")
}   // Aquí estamos pasando un string a la función pr()

fun pr(mensaje: String) {
    println(mensaje)
}   
// La función pr() devuelve el string sin "return". 
// A este tipo de dato se lo llama Unit