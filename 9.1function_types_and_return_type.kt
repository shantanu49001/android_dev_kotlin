//we will see how a function can be psses as a paramet and how it can be returned
//parameter type must match withtthe function
//reurn type must match withtthe funcion
fun getSum(x:Int,y:Int):Int{//properly defined regular function
    return x+y
}

//high order function
fun performOperation(x:Int,y:Int,fn:(Int,Int)->Int){//function that has 3 parameters teo are integers and thord is a function and it return \s an integer of Int
    val result=fn(x,y)
    println("Result of $x and $y is:$result")
}


//retuns a function
fun getLength():(String)->Int{  //function having 0 parameter and return type a function that has a string as a paramatert and returns int
    return {x:String->x.length}
}

fun main(){
    performOperation(x=2,y=4,::getSum)
    performOperation(x=8,y=1,{x,y->x-y})
    performOperation(x=7,y=6,fun(x:Int,y:Int):Int=x*y)
    val f:(String)->Int=getLength()
    println("Lemgth is ${f("Mark")}")
}
//understand the concept in a proper sequence order
//study what are closure functions
//labda function cannot return
//