//varaibles->member or instance varaibles
// var [name]: [type] = "[value]"
//var -.cannot change mutable
class student{
    val school: String ="DP School"
    var age:Int=5
    val isTeenager:Boolean
    get() = age>12//getter depends on agr   gets value for isTeen
    var name: String?=null//nullable variable
   //when we acess name it is called getter
    get() = field ?:"Unkown"//elvis operator if null return unkonn
    set(value){//name= mark=value
        if (value!=null){
            field=value//field gets value =mark that sets name=mark
        }
    }

}
fun main(){

}