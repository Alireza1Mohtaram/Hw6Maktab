import kotlin.math.pow

fun main() {

    println("Enter 0 to exit ")
    var commmand = 0
    var inputs = 0

    loop@while (true) {

        try {


            println("Enter 1 to convert to Binary :")
            println("Enter 2 to convert to Decimal :")
            commmand = readLine()!!.toInt()
            println("Enter number to convert :")
            inputs = readLine()!!.toInt()
            when (commmand) {
                0 -> break@loop
                1 -> toBinary(inputs)
                2 -> toDecimal(inputs.toString())

            }


        } catch (e: Exception) {
            println("Invalid entry cause of ${e.cause}")
        }

    }
}


fun toBinary(decimal: Int): String {

    val binaryResult = Integer.toBinaryString(decimal)

    println("Binary($decimal) : $binaryResult \n")
    return binaryResult
}


fun toBinaryInline(decimalN: Int): String {

    var localDeci = decimalN
    var binaryNumber = 0
    var count = 0
    while (localDeci != 0) {
        val rem = localDeci % 2
        val c = 10.0.pow(count)
        binaryNumber += (rem * c).toInt()

        localDeci /= 2
        count++
    }
    println("Binary($decimalN) = $binaryNumber \n")
    return binaryNumber.toString()
}

fun toDecimal(binaryNumber: String): Int {
    var sum = 0.0
    binaryNumber.reversed().forEachIndexed { k, v ->
        sum += v.toString().toInt() * 2.0.pow(k)
    }
    println("Decimal : $sum\n")
    return sum.toInt()
}