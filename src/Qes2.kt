import kotlin.math.max

fun main(){

    var loopInput = readLine()!!.toInt()
    var pointsInput = mutableListOf< Pair<Int,Int> >()
    var localInput = mutableListOf<String>()
    for (i in 1..loopInput){
        localInput = readLine().toString().split(" ") as MutableList<String>
        pointsInput.add( Pair( localInput[0].toInt() ,localInput[1].toInt()) )
    }
    println(  getPointvalue(pointsInput) )
}
fun getPointvalue(pointsInput: MutableList<Pair<Int,Int>>):String  {

    var max = findMax(pointsInput)
    var createMat = Matrix(max+1,max+1).init()
    var localInput = StringBuilder("")

    pointsInput.forEach(){
        localInput.append( createMat.getElement(it.first,it.second).toString()+" " )
    }
return localInput.toString()
}

fun findMax(pointsInput: MutableList<Pair<Int, Int>>): Int {
    var max = 0
    var localXY:Int
    pointsInput.forEach(){
        localXY = max(it.first,it.second)
        max = max(localXY,max)
    }
    return max
}

fun Matrix.init() :Matrix{
    matrix[0][0] = 0
    matrix[1][1] = 1
    var c = 2
    for (i in 2 until this.x){
        matrix[i][i-2] =c
        matrix[i][i]=c+2
        if(i%2 == 0) c++
        else c += 3

    }
     return this
}


