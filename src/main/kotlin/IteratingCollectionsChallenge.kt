fun main(){

    val matrix = MutableList(3) { MutableList(3) {"."} }
    matrix[1][2] = "x"

    row@ for (i in 0..matrix.lastIndex){
        column@ for (j in 0..matrix.lastIndex){
            if (matrix[i][j] == "x"){
                println("X is at row $i and column $j")
                break@row
            }
        }
    }
}