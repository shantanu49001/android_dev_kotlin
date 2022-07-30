//they dont' have constructor
//singlton aare object having single instances
class Student___(val name:String){
    companion object{
        const val schoolName="DP School"
    }
}
fun main(){
    println("The score is ${Student___.schoolName}")
}//it behaves as if the oject class is a variable of class Student