fun <T> printContent(content:T){
    println("The content is $content")
}
fun main(){
    printContent<String>(content = "Hello")
    printContent<Int>(content = 9)
}