//return of a lambda are non local-->it prints the outer return of parent function
//as we return from outer function
//we ned to resolve this

inline fun pr(ff:(String)->Unit):Unit{
    ff("John")
    println("Data printed")
}
fun main(){
    pr { println(it);return }
}
//upper code doesn't print local return of lambda but it printred only john
//add crossline before ff and remove return in main
//also useful when we are callinf a labda over another object


