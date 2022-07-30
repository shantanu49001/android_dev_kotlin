//constructor crated to call object and intialise propertis of class
//kotlin has two constructors
//primary and secondary
//seconadry contructor needs to call the primary one



//we can set internal property to primary constructor onle
//internal property means rirctly passing the first name vale as arguet
//in that case val firt name remove
//imit this.frst name remove
class Child(firstName: String="Mark"){//primary cont -->empty init initialises
    val firstName:String//data memebers
     var lastName:String?=null
    init {
        println("Init block called")
        this.firstName=firstName//initilises the first nae
    }
    constructor(firstName: String,lastName: String):this(firstName){//secondary ,non empty self initiases  this has return type fist name
        println("Secondary constructor called")//whe n here first name is set ir moves to primary constructor then to init and then the firdt nzm is set
        this.lastName=lastName
    }
}
fun main(){
    val student:Child=Child(firstName = "John")//this calls the primary one with one arameter through init and other is nullable
    println("Name of student is :${student.firstName} ${student.lastName}")
    //object ka name student hai
    val student_:Child=Child(firstName = "shantanu", lastName = "Tiwari" )//this calles the sencondary one the seconady sets the lastname but for first name first the primay is cammed theat calls the init and then  the vales of first name s set
    println("Nmae is ${student_.firstName} ${student_.lastName}")
}
//firt primary constructor is called
//when primary is called init called
// init can acess paramets of primary