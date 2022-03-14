fun main(){

    val range = 1..20
    for (number in range) println(number)

    println("------------")

    for (number in range step 3) println(number)

    println("------------")

    for (number in 15 downTo 1 step 2) println(number)
}