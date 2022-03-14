fun main(){

    fun nameLength(firstName: String, lastName: String = "") : Int {

        return firstName.length + lastName.length
    }

    val name = "Marko"
    val surname = "Peric"

    println(nameLength(name, surname))
}