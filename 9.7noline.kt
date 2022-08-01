//not all parametrs in a inline function can be made inline
//a labda parametr can't be passed to other functions


inline fun print(name:String,fu:(String)->Unit,noinline fn2:(Int,Int)->Unit){
    fu(name)
    Prr(fn2)//this is retuning error as fn2 is a lambda param and it is passed to other function
    //write no inline before fn2->useful whe  e have to store or pss a lambda parametr

}
fun Prr(f:(Int,Int)->Unit){

}

