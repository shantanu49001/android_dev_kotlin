//when we want to make small changes in previous a=class and we want o t void making completl new classes
//very importn=ant concept for event listening
open class Person_{
    fun walk(){
        println("Person is walking")
    }
    fun sleep(){
        println("Person is sleepng")
    }
    open fun talk(){
        println("Person is talking")
    }
}
fun main(){
    startTaliking(object : Person_ (){//anonymous class strttaling that though person's object overrides function of person
        override fun talk() {
            println("I am talking")
        }
    })
}
fun startTaliking(person_:Person_){//now for this function argument is object of person class
    person_.talk()//now it will print "I am talking " in place of peron is talking
}