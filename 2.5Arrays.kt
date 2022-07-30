fun main(){
    val numbers= arrayOf(1,2,3,4)
    println("The number at second position :${numbers.get(1)}")
    numbers.set(3,5)
    numbers[1]=22
    println(numbers.joinToString(separator = "," ))//jab bhi function me pass akemge to =
    var numbersZero=Array(size=4){0}
    println(numbersZero.joinToString(separator=","))
}