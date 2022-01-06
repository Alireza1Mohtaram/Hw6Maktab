import kotlin.collections.ArrayList
import kotlin.math.max

class Matrix() {

    var x: Int = 1
        set(value) {
            if (value <= 1) field = 1
            else field = value
        }
    var y: Int = 1
        set(value) {
            if (value <= 1) field = 1
            else field = value
        }
    var matrix = Array(x) { IntArray(y) }

    init {
        creatMatrix()
    }

    constructor(x: Int, y: Int) : this() {
        if (x >= 1) {
            this.x = x
        } else {
            this.x = 1
        }

        this.y = y
        creatMatrix()


    }


    fun setElement(x: Int, y: Int, value: Int) {

        if (x > this.x || y > this.y) {
            println("This opreation is not executable ")
        } else {

            this.matrix[x][y] = value
        }

    }

    fun getElement(x: Int, y: Int): Int {
        return this.matrix[x][y]
    }


    fun creatMatrix() {

        matrix = Array(x) { IntArray(y) }

    }

    override fun toString(): String {


        var str: StringBuilder = StringBuilder()
        for (i in 0 until x) {

            for (j in 0 until y) {
                str.append("${matrix[i][j]}  ")
            }
            str.append("\n")
        }

        return str.toString()
    }



    private fun copyMatrix(m: Matrix): Array<IntArray> {

        var matrixCopy = Array(m.x) { IntArray(m.y) }

        for (i in 0 until x) {
            for (j in 0 until y) {

                matrixCopy[i][j] = this.getElement(i, j)


            }
        }
        return matrixCopy
    }
}
