import org.w3c.dom.Text

//reprent restrict class heirachy
//declares no of sub class possible for a parent class
//multiple instances of sealed class
//sub class can have their own properties
sealed class NetworkState{//class
    data class Error(val errorText: String):NetworkState()//sublass Error inherting from Network satae
    object Loading:NetworkState()//object loading of network sate
    data class  Loaded(val content:String):NetworkState()
}
fun main(){
    val data:NetworkState=NetworkState.Loaded(content = "Data Loaded")//varaiable that is object of classes
    processState(data)//function
}
fun processState(state: NetworkState){//function that is havinf argument of class network state
    when(state){
        is NetworkState.Error->{
            println("Error occured:${state.errorText}")}
    }                  //.Loaded
}                     //.Loading