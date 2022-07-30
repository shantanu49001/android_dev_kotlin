class Student_o constructor(val name:String="Mark"){//priary
//secondary
constructor(firstName:String,lastName:String):this(firstName ,lastName)
//if we want that users don't acess primary const i.e both firlds needed
//add private after student_o
}
fun main(){

    val student=Student_o(name = "John")
    val student_c=Student_o( "John","Doe")
}