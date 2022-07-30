//set->set of unique elents
fun main(){
    val names= setOf("John","Mark","Finn")
    println("1.The size of Set is:${names.size}")
    println("2.Set contains ${names.contains("Finn")}")
    //names.add("Sarah")                      for these use mutableSetOf
    //names.remove(element:"John")
}
