//when function pafamerts or type become very big

//need to be declared on the top
//no new type function is crete dit is a poiter to alredy existing function


typealias intfn=(Int,Int)->Int //this function takes 2 integers and return a integr
typealias str=String

fun printSum(x:Int,y:Int,fn:intfn){
    val sum=fn(x,y)
    println("Sum of $x and $y is $sum")
    val x:str="John"
}