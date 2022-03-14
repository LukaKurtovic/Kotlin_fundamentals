fun main(){

    val year = "2000"

    val century = when (year.toInt()){
            in 2000..2099 -> "It's 21. century"
            in 1900..1999 -> "It's 20. century"
            in 1800..1899 -> "It's 19. century"
            else -> "This was long time ago"
        }
    println(century)
}