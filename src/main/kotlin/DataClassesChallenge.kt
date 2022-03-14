
data class Game2(
    val name: String,
     val genre: String
)
{
    override fun toString(): String {
        return "Game's name is $name and it is $genre game"
    }
}

fun main(){

    val game1 = Game2("Call of duty", "First person shooter")
    val game2 = Game2("GTA", "Open world")

    val game3 = game1.copy()

    println(game3 == game1)
    println(game3 === game1)

    val (name, genre) = game1

    println(name)
}
