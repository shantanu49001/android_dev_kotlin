//when aka switch
fun main(){
    val rating=4
    val result=when(rating){
        5->"High"
        4->"Good"
        3->"Average"
        2,1->"Low"
        0->"Fail"
        else->{
            println("No Rating")
        }
    }
    println("The rating is $result")
}