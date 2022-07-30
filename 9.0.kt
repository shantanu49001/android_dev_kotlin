//function can return a function
//functions are first classmembes
//function can be stored as a varaiblr
//pass a functon as arument as function
//hof ->takes functon as paramater or reeuns fuction as paraametrr



//since varaible are storing function they must have proper type


fun main(){
   val f1:(Int,Int)->Int   //this varable stoes a function that has two int pramaets and retiuns a int
   val f2:(Int,Int)->Boolean


    val f0:()->Unit   //this var takes a function 0 paramets and return nothing

    val f3:((String)->Int?)    //function tht has string argument int return type and is nullable also

//we can also assign regular function to a variable
    f1=::addInt

    fun addInt(x:Int,y:Int):Int{//f1 stores a regular function
        return x+y
    }
//storing lambdas
    f2={x:Int,y:Int->x>y}//last expression is return value


//anoymous are regular functions without a name
    f3=fun(s:String):Int{return s.length}

}


//invking the fuction
f3("Mark")
        //qs me unit wala return nothing ->take care
//labmda expression can't be generic
//