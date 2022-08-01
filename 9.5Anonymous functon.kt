//they are also function literals i.e tey cn be assigned to a var
//we don't need name for annoynmous function


//retun type is explixit in anaiynm
//labda me return type last expr tha

fun performOperation_(x:Int,y:Int,fn:(Int,Int)->Int){
    val result=fn(x,y)
    println("djdjd")
}

fun main(){
    val f0_:(Int,Int)->Int=fun(x:Int,y:Int):Int=x+y
    performOperation_(x=4,y=8,f0_)
}
