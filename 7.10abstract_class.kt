//clas left for others to complete
//it has one or more propeezties tht ned to be completed by clases inheriting it
//asbtrTACT is by default open
//abstract cannot have abody
//an abstract need to be compulsorily used by che   ild classes
abstract class Personal(var name:String){
    abstract fun doWork()//this must be empty
    fun doTalk(){

    }
}
class Student_l(name:String,val school:String):Person(name){
    override fun doWork() {//this calass overries the parent class that has functions but empty anf override t's funvctions that are completly empty
        println("Student is studying")
    }
}
fun main(){
    val student=Student_l(name="John",school="Dp School")
    student.doWork()
}