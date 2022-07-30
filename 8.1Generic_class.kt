import javax.swing.text.AbstractDocument

class Printer<T>(){
    fun <T> printContent(content: T){
        println("The content is $content")
    }
    fun someotherfunction(value:T){

    }
}
fun main(){
    val printer=Printer<String>()
    printer.printContent(content = "Hi")
    val printer1=Printer<Int>()
    printer1.printContent(content = 12)
}