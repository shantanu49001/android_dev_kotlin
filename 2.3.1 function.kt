fun main(){
    var z:Int=volume(boxName="Record",length=1,height=10,width=5)
    println(z);
}
fun volume(boxName:String,length:Int,width:Int,height:Int):Int{
    println(boxName)
    return length*width*height

}
fun vol(x:Int,y:Int)=x*y
