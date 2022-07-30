import javax.swing.text.Position

//a class can inherit from only one class
//but it can inherut from many intrfaces
//interfaces have no constructor
interface Footballer {
    val position:String
    fun dribble()
    fun kick(){
        println("Kick th footballer")
    }

}
open class Person_o(val name: String)
class Student_c(name: String,override val position: String):Person_o(name),Footballer{
    override fun dribble() {
        println("Dribble the ball")
    }
}
fun main(){
    val student=Student_c(name="John",position="Stiker")
    playFootball(student)
    printName(student)
}
fun playFootball(footballer: Footballer){//footballer object
    footballer.dribble()                 //interface
    footballer.kick()
}
fun printName(personO: Person_o){//person object
    println("Person name is ${personO.name}")
}

//abstract and inhertence only difference is that abstract class have no prprty
