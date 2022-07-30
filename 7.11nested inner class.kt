//nested class can't acess data members of outer class
class Student_m(val name: String){//can't be acessed by schoolbag
    class SchoolBag(){
        fun printBagOwner(){
            println("This is school bag that belongs to ")
        }
    }
}
fun main(){
    Student_m.SchoolBag().printBagOwner()//acess the nested class

    //without creating object of inner class
    //to acess name property of outer class write inner Class SchoolBag
// and we have to write Student_m(name:"Mark").SchoolBag().printBagOwner()
}