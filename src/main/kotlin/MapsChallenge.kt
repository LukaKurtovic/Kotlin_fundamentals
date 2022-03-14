fun main(){

    val pets = mutableMapOf<String, String>()
    pets["Pas"] = "Njemacki ovcar"
    pets["Macka"] = "Perzijska"
    pets["Klokan"] = "Australski"

    pets.put("Majmun", "Orangutan")
    pets.remove("Macka")

    for ((key, value) in pets){
        println("$key is $value")
    }
}