import java.util.*
class Account(var balance:Int,val rate:Float){
    fun deposit(amt:Int){
        balance+=amt
    }
    fun withdraw(amt:Int){
        balance-=amt
    }
    fun addInterest(){
        balance+=(balance*rate).toInt()
    }
}
fun main(){
    val read=Scanner(System.`in`)
    println("Enter balance")
    val balance=read.nextInt()
    println("Enter the rate")
    val rate=read.nextFloat()
    val account=Account(balance,rate)//object created for class
    var input=read.nextInt()
    println("Enter ur choice")
    while(input!=-1){
        when(input){
        1->{
            println("Enter the amount")
            var amt=read.nextInt()
            //function call by object
            account.deposit(amt)
        }
        2->{
            println("Enter the amount")
            var amt=read.nextInt()
            account.withdraw(amt)
        }
        3->account.addInterest()
    }
    println("Enter next choice")
    input=read.nextInt()
}
print(account.balance)
}