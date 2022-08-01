//we can also pass lambda to a functio ouside ()
//and if a function's () is empty we can remove it
//in kotlin lambdas can't return
//it can return if we make a function (outer inline
inline fun PrintSum(fn:(Int?,Int)->Int){
    val x=null//fn is a labda function that can't return anything but it is retuning int
    val y=7
    fn(x,y)
    println("Done")
}
fun main() {
    PrintSum { x: Int?, y: Int ->
        if (x == null) {
            return@PrintSum //labelled return return from printSum
        } else {
            println("Done")
        }
    }
}//here it is able to return due to inline