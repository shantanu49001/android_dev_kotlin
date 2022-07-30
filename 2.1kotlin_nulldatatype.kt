fun main(){
    /*shows error as we can'r declare a null to non null data type
    var name:String=null;
    println(name.length)*/
var name:String?=null//no error as we have declare to check null first and then implement null value
    //?safe call opearatoe
    println(name?.length)
    //it checks for null if not it makes usual call if null it return null
    //elvis operatoe ?: check s for null
    println(name?.length?:0)//if name.length=null print 0



}