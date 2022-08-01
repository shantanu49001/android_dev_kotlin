//reciver is object on which function is called
fun main(){
    val f0___:(Int)->Unit
    val PrintS:Int.(Int)->Unit={ println("The sum of $this and $it ")}
    val x:Int=6
    x.PrintS(4)
    //since x is also int and recircer Int. is also int x can be a object of function
    //it->when lambda has on;y one param it=4
    //this->object =6
}