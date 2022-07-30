fun main(){
    val i:Int=4
    val j:Int=1
    for (i in 1..4){// 1 include 5 exclusw
        for (j in i downTo 1){
            print(j)

        }
        println()
    }
}