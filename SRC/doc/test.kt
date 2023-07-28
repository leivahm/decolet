fun main () {
    //val greeting = birthdayGreeting()
    //println(greeting)
    println(birthdayGreeting("Ivo", 17))
}

//fun birthdayGreeting(name: String, age: Int): String {}
fun birthdayGreeting(name: String = "Zoe", age: Int = "10"): String {
    val nameGreeting = "Happy birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}