import java.lang.Exception
import java.lang.NumberFormatException

//catching and avoiding the programme

//try->we are attempting to run the code we are not sure it will run all times
//it comes with a catch block->substtitue to do in place of returning exception

fun parseMovieName(name:String):Int{
    return name.toInt()
}

fun main(){
    //val movieN="300--->this will not return exception
    val movieN="Titanic"//this will
    try {
        val x=parseMovieName(movieN)
        println(x)
    }catch (ex:NumberFormatException){//more specific now all the errors apart from this will be handled by the paret excepton class
        println("Movie name was not number")
    }
    catch (ex:Exception){//class imported-->not it will try to match the exetion classes if we declared and if not matching class found it will execute in exception paent clas
       //it will catch all ex ceptions paret of all exception classes but not specific
        println("Exception happened ${ex.message}")
    }
finally {
    println("Finally block")//cleanup resource itwill be executed block
    //to run programme if exception happemed or not
    //to resume to main prog
        //main prog can start from here
}
}


