fun main(){

    val deskItems = listOf("Pen", "Pencil", "Computer", "Pen")
    val uniqueDeskItems = deskItems.toMutableSet()

    println(uniqueDeskItems)

    uniqueDeskItems.remove("Pencil")

    for (element in uniqueDeskItems){
        println(element)
    }
}