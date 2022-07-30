//in usual languages small datatype can be convertoed to bigger ones
//eg int->long me convert kr sakte hai
//but here we cabn't directly do that
fun main(){
    val a:Int=10
  /*  val b:Long=a */ //retun error
    val b:Long =a.toLong()
    println(b)

    //type check
    val name:Any ="John"//not declaring var type
    if (name is String){//is->to check data type
        println(name.length)
    }
//casting var to var
val x:Int =7
    val y:Long=x as Long
    var z:Long? =x as?Long
    println(z)
}