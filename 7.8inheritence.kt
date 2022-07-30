//classes are private by default i.e we can't inherit them
//to make i "inhertable" open added
open class Person(val name:String){//ptimary constru
    init{
        println("This is a person")
    }
    var age:Int=1
    open fun doWork(){
        println("Person is doing work")
    }
}
//in kotlin we can inherit from one class only
//parent/super/base->person
//child/subclass->student
class Student_p(name:String, val school:String):Person(name){//this calss inherts from person and oder of inhertence is apploed at variable level to var of each class
    init {
        println("This is a student")
    }//we can ivveride a function of parent as well same appiles to perperty as well property is arugumet s in constructor
    override fun doWork(){//but we have to write open there
        println("Student studies")
        super.doWork()//to acess properties of parent
    }
}
fun main(){
    //sub class has control of functions of parent if oinherited

    Student_p.doWork()//we can do this as student inherits persong so it can acess it's ember functions as if it was their own
//inbuilt class that is bydefault parent of all other classes
    val x:Any =4
    val y:Any="Mark"
}