fun main(){

    val password = "1234567890"
    val isSecure = password.length >= 10
    println(isSecure)

    val firstPersonName = "Marko"
    val secondPersonName = "Pero"
    val isEqualLenght = firstPersonName.length == secondPersonName.length
    println(isEqualLenght)
}