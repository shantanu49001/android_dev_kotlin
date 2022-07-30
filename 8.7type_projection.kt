//copyinh a lait of type int to list of type string
//we are doing this by class but as we know that complex generic functions are immutable
class ListExample{
    fun copy(from:MutableList<out Any >,to:MutableList<Any>){
        for (i in from.indices){
            to.add(from[i])
        }
    }
}
fun main(){
    val any:MutableList<Any> = mutableListOf("John",7)
    val numbers:MutableList<Int> = mutableListOf(1,2,3)
        ListExample().copy(numbers,any)//-->showing eerro as complex generic classes are inhertibale
        //add out
}