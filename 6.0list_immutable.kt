fun main(){
    val names= listOf("John","Mark","Sarah","Finn")
    println("1.The size of the list is:${names.size}")
    println("2.The second item in the list is :${names.get(1)}")
    println("3.The second item in the list using index operator is ${names[1]}")
    println("4.Finn is at ${names.indexOf("Finn")}")
    //names.add("sarah")====>not allowed as it is immutabe list
}