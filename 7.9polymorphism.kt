open class Vehicle{
    open fun startEngine(){

    }
}
class BMW():Vehicle(){
    override fun startEngine() {//since it is iverriding so we need open
        println("BMW:starting the Engine")
        super.startEngine()
    }
}
class AudiCar():Vehicle(){
    override fun startEngine(){
        println("AudiCar:Strating the engine")
    }
}
fun main(){
    val bmwCar:BMW=BMW()
   val AudiCar:AudiCar=AudiCar()
    
}