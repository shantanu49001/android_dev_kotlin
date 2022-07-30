//enum constants are variable that give possible values of a variable
enum class Metal(var symbol:String){
IRON(symbol = "Fe"),
GOLD(symbol = "Au"),
SILVER(symbol = "Ag")
}
fun main(){
    for (metal in Metal.values()){//iterator
        println("Symbol: ${metal.symbol},Name:${metal.name},Ordinal ${metal.ordinal}")

    }
    printMeatl(Metal.IRON)
}
fun printMeatl(metal: Metal){
    println(metal.name)
}