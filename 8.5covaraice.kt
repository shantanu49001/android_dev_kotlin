//resolving non inhertoble apability of comlex generic classe
 //complex generic type are invariant we are making that co variant


open class Fruit
class Apple:Fruit()


class Box<out T>{  //but here is a catch that can return only T it cannot have argument as T
    fun get():T{
        TODO(reason = "Return item")}
    //fun put(iten:T){}--->this will return error
}
fun main(){
    val appleBox=Box<Apple>()
    val box:Box<Fruit> =appleBox//error here to resolve add write out
}