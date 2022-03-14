fun main(){

    val balance = 100.0
    val creditCard = Triple("123123123", 123, "Visa")

    val bankAccount = Pair(balance, creditCard)

    println("Balance: ${bankAccount.first}, Card number: ${creditCard.first}, Card type: ${creditCard.third}")
}