//basically inline function
//using inline function we can get parameter typ in run time and this is called reified
//coz when we are using any all varaibel are traeted as one
inline fun <reified T> checkTypeAtRuntime(item:Any){
    println("${item is T}")
}

fun main(){
    val names:MutableList<String> = mutableListOf("John","Sraha")
    val ages:MutableList<Int> = mutableListOf(1,2,3)

    checkTypeAtRuntime<String>(item = "John")//type string aragument string answer=true
    //println()
    checkTypeAtRuntime<Int>(item = "Srah")//false
}
