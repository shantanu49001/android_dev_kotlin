//complex type me sub classing nhi ho sakti
//generics are invariant in kotlin


open class Person__(val name: String)
class Studdent(name: String):Person__(name)
fun main(){
    val name:List<String> = listOf("John","Sarah")
    val ranks:List<Int> = listOf(3,4,5)

    val student_p:Studdent=Studdent(name="John")
    val person_m:Person__=student_p//non complex generics are inheritable

  val studn:MutableList<Studdent> =mutableListOf(Studdent(name:"Jack"),Studdent(name:"Sarah"))
  val perso:MutableList<Person__> =studn;//error here coz xomplex class generics are not inheritable

}
