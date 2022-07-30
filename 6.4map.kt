//key value pairs are passed
fun main(){
    //immutable map
    val classRanks= mapOf(1 to "Sarah", 2 to "mark",3 to "Finn",4 to "John")
    println("1.Students:${classRanks.values}")
    println("2.Ranks:${classRanks.keys}")
    println("3.Finn has got a rank ${classRanks.containsValue("finn")}")
    println("4.There is a 4th rank ${classRanks.containsKey(4)}")
    //classRanks.put(5 to "Jim")         mutableMapOf
    //classRanks.remove(key:4)

}