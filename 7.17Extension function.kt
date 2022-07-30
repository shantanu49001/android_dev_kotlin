//we can add new features to class without inheriting,making changes to a class
class Student_i(val firstName: String,val lastName:String)
fun.Student_i.fullName()="${this.firstName} ${this.lastName}"
        fun Int.getEven():Int{
            if (this%2==0){
                return this
            }
            else{
                return this+1
            }
        }
fun main(){
    val student=Student___("Doe",name="John")
    println("The full name is :${Student_i.fullName()}")
    val x:Int=23
    println("The even age is ${x.getEven()}")


}