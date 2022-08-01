import java.util.*

//we used inline prevously for reified and return of lambda



//here we are discussin it further
//one more use ->to prevent run time overhead

inline fun perf(name:String,fm:(String)->Unit){
 fm(name)
}
fun main(){
    val name:String="John"
    perf(name){ println(it)}//labda ka only one param
//now if we assume that this lambda tries to get a closure and this function is called many times so there will be a overhaed each time
//so we write inline so that copy if function is presen then and there on;y

}