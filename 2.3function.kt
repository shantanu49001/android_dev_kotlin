//in kotlin we have to return something
//if not returning anything Unit use
fun main(){

    add_n(x=4 ,y=5)
}
fun add_n(x:Int, y:Int=7):Int{
    println("The name is:$x  ")
    return x+y
}