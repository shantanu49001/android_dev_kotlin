//we need to store only data from resources and data bases
//it can have only properties inside constructor
//when euating hte objects data class considers only data memers in side the class
data class Student__(val name:String,var section:String){
    var age:Int=8//this is the data class
}
fun main(){
    val student=Student__(name="John", section = "A")
    student.age=10;
    val student1=Student__(name="John", section = "A")
                                       //while comparing obkjects data insieclass is considdered
    println("Line1:equals() function: ${student1.equals(student)}")
    println("line2: to equals function:${student1.toString()}")//string me daal do data memebers of object
    val student2=student1.copy(name="Mark")//copying data members of one object to other
    val(A,B)=student1//destructuring ,storing data memebers of objects into other variables
    println("SEction :${A} name:${B}")

}