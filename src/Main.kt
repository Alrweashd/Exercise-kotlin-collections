fun main() {
    //println("Hello World!")

    //Part 1
    val favFruits = mutableListOf("Apple", "Mango","Orange")
    favFruits.add("Berries")
    favFruits.removeAt(3)
    println(favFruits)

    //Part 2
    val numbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5);
    numbers.add(3)
    numbers.add(6)
    println(numbers)

    //Part 3
    val countryCapitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryCapitals["Canada"] = "Ottawa"
    println("Countries: ${countryCapitals.keys}")
    println("Capitals: ${countryCapitals.values}")
    countryCapitals.remove("Germany")
    println("Final Map: $countryCapitals")


}

