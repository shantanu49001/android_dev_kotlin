import javax.swing.JCheckBoxMenuItem

//here we are doing opposite we are trying to substitute a child class to parent generic class
//we wrie in here
//here functions can have parameter T but not reurn T
open class Fruit_
class Apple_:Fruit_()


class Box_<in T>{
    fun put(item: T){

    }
}

fun main(){
    val fruitBox_=Box_<Fruit_>()
    val appleBox_:Box_<Apple_> =fruitBox_
}


