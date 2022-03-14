fun main(){

    val favoriteGames = arrayOf("Game1", "Game2", "Game3", "Game4", "Game5")
    favoriteGames[1] = "Call of duty"
    println(favoriteGames[1])

    val gamesList = favoriteGames.toMutableList()
    gamesList.add("Game x")
    gamesList.add("Game y")

    gamesList.remove("Game5")

    println(gamesList)
}