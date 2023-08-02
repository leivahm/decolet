fun main() {
    var city = "Ankara"
    var lTemp = 27
    var hTemp = 31
    var cRain = 82
    println(printCityWeather(city, lTemp, hTemp, cRain))
    
    city = "Tokyo"; lTemp = 32; hTemp = 36; cRain = 10
    println(printCityWeather(city, lTemp, hTemp, cRain))
	
    println(printCityWeather("Cape Town", 59, 64, 2))
    println(printCityWeather("Guatemala City", 50, 55, 7))
}

fun printCityWeather(city: String = "Ankara", lTemp: Int = 27, hTemp: Int = 31, cRain: Int = 82) :String {
    var weatherMsg: String
    weatherMsg = "City: $city\nLow temperature: $lTemp, High temperature: $hTemp\nChance of rain: $cRain%\n"
    
    return weatherMsg
}