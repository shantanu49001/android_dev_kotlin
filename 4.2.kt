fun main(){
    println("Line 1")
    for (i in 1..5){
        println(i)
    }
    for (i in 1 until 5){
        println(i)
    }
    //if 4! in 5..10
    for (i in 5 downTo 1){
        println(i)
    }
    for (i in 1..5 step 2){
        println(i)
    }
}