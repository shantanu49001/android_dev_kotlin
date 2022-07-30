import java.io.Serializable

//restrict value of T
//number is parent clas of int float but not string


//single upper bound
fun <T> printPrice(price:T){
    println("The proce is $price")
}



//nullabe and non nullable  bounds
fun <T:Any?> printPrice_n(price: T){
    println("TH eprice is $price")
}

//multiple bounds
fun <T> printPrice_o(price: T) where T:Number,T:Serializable{
    println("The price is $price")
}
