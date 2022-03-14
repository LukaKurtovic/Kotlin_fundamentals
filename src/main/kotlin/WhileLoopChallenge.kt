fun main(){

var i = 1
    while (i < 16) {
        println(i)
        i++
    }

    val names = listOf("Marko", "Pero", "Luka", "Ivo")

    var j = names.lastIndex

    do {
        println(names[j])
        j--
    }while (j >= 0)
}