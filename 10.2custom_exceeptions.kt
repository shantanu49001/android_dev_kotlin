import java.lang.Exception

//how we as a programmer can throw a exceprion
fun pp(name: String){
    if (name.length<3){
        throw Exception("Name too short")//as soon as we type exception a class is imported

    }
    println(name)
}

class ShirtnameException(msg:String):Exception(msg)//this is our custeom classses returning a exception and it can be called by it's own object whenever we wan to  return a exception
//it will return error in console with message
//it shws that we created a user defined exception by creating object of class Exception
fun main(){
    pp(name="John")
}
//no system class inviolved so all erros are blue not grey