//they are not declared but can be passed to var that is of functiin type
fun main(){
    val name:String="John"//for refeence
    val f0:(Int,Int)->Int={x:Int,y:Int->x+y}
    //  name:type=value---->general variable declaration method
    //we ca aso wrute f0:(Int,Int)->Int={x,y->x+y}


    //minimal lambda expression
    val f1={2}

    //complier can aslo take type of it's own
    val f2={x:Int-> println(x)}


    //ingle parameter lambda function
    val f3:(String)->Int={x:String->x.length}
    println(f3.invoke("John"))

    //when we have single paramter we can write it in place of var name
    val f4:(String)->Int={it.length}
    println(f4.invoke("Shantanu"))





}