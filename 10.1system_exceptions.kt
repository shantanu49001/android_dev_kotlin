fun m(name:String):Int{
    return name.toInt()
}
fun main(){
    val name:String="300"//this will not retun exception
    val nme:String="TiTanic"//this will return error
    val x=m(name)
    println(x);
}