class Game(
    private val name: String,
    private val genre: String
)
{
    override fun toString(): String {
        return "Game's name is $name and it is $genre game"
    }
}

fun main(){

    val game1 = Game("Call of duty", "First person shooter")
    val game2 = Game("GTA", "Open world")

    println(game1)
    println(game2)
}