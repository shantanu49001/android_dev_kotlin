//when we are not bothered abiut list type extension of previous code
//mutble list or any generic class
fun printItems(item:MutableList<*>){
    for (i in item.indices){
        println(item.get(i))
    }
}
fun main(){
    val x:MutableList<Any> = mutableListOf(1,2,"a")
    printItems(x)
}