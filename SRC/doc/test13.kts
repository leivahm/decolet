fun main() {
    val nombre : String
    nombre = "Fabricio Maximilian Leiva"

    pr("Ey, hola $nombre!")
}   // Aquí estamos pasando un string a la función pr()

fun pr(mensaje: String) {
    println(mensaje)
}   
// La función pr() devuelve el string sin "return". 
// A este tipo de dato se lo llama Unit