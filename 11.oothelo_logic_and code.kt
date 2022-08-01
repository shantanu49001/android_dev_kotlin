/*
* 8x8 board
* few cells where black and white can make a movie
* b/w two black cells no of white cells change to black
* wahi move kr sakte hai jaahan beech me white hi
* hr cell me pattern search krna hai
* multple direction me conversion possible hai
*
* finally when all the board is occupies the one more will win
* else when black hai no chance chance will be given to other
*
*
* logic-:
* player board manager->3 classes
* board->int 8x8,4 cells already filled 33-w 43 black 43 w 44 white
* manager function->move()->parametrs symbol x,y   bool type
*                 ->if bbol true make changes()
*                 ->x,y pe move krna hai let's say; at each direction of cell i will searhch bwwb or wbbw  till that direction is vlid
*                 ->if we get any white b/w start b and end black convert all to black and also no element must be empty b/w
*                 ->how to check move har direction me move krte time change n x and y moniter
*                 ->x ke stpes changes ek array me oniter and y ke alag
*                 ->then ek ek direction dono array me move krke check
*                 ->
* */
package post6
import java.text.DateFormatSymbols
import java.util.*

fun main(args: Array<String>){
    val read=Scanner(System.`in`)
    val player1symbol=1
    val player2symbol=2
    val b=OthelloBoard()
    var n:Int=read.nextInt()
    var p1Turn=true
    while (n>0){
        val x:Int=read.nextInt()
        val y:Int=read.nextInt()
        var ans:Boolean
        ans=if (p1Turn){
            b.move(player1symbol,x,y)
        }
        else{
            b.move(player2symbol,x,y)
        }
        if (ans){//valid turn
            b.print()
            p1Turn=!p1Turn
            n--
        }
        else{
            println(ans)
        }
    }
}
class OthelloBoard{
    private val board:Array<IntArray> =Array(8){IntArray(8)}
    fun print(){
        board.forEach { row->
            row.forEach {
                print("$it")
            }
            print()
        }
    }
    fun move(symbol:Int,x:Int,y:Int):Boolean{
        if (x<0||x>=8||y<0||y>=8||board[x][y]!=0){
            return  false
        }
        var movePossible=false
        for (i in xDir.indices){
            val xStep=xDir[i]
            val yStep=yDir[i]
            var currentX=x+xStep
            var currentY=y+yStep
            var count=0
            while (currentX in 0..7 && currentY in 0..7){
                //empty cell between
                if (board[currentX][currentY]==0){
                    break
                } else if (board[currentX][currentY]!=symbol){
                    currentX+=xStep
                    currentY+=yStep
                    count++
                }else{
                    if (count>0){
                        movePossible=true
                        var convertX=currentX-xStep
                        var convertY=currentY-yStep
                        while (convertX!=x||convertY!=y){
                            board[convertX][convertY]=symbol
                            convertX-=xStep
                            convertY-=yStep
                        }
                    }
                    break
                }
            }
        }
     if (movePossible){
         board[x][y]=symbol
     }
        return movePossible
    }
    companion object{
        const val player1Symbol=1
        const val player2Symbol=2
        private val xDir= intArrayOf(-1,-1,0,1,1,1,0,-1)
        private val yDir= intArrayOf(0,1,1,1,0,-1,-1,-1)
    }
    init {
        board[3][3]= player1Symbol
        board[3][4]= player2Symbol
        board[4][3]= player2Symbol
        board[4][4]= player1Symbol
    }
}