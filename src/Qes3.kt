import java.util.*

fun main() {

     println("Enter 0 to exit ")
     var command = 0
     var str = mutableListOf<String>()
     var inputs = mutableListOf<Pair<String, String>>()

         try {
         str = readLine().toString().split(" ") as MutableList<String>
             println("Str is -> $str")
             inputs.add( Pair(str[0], str[1]) )
             println("inputs is -> ${inputs}")


         for (i in 1..3) {
             str = readLine().toString().split(" ") as MutableList<String>
             inputs.add(Pair(str[0], str[1]))
             println("inputs is -> ${inputs.toString()}")

         }


             printMid(inputs)

     } catch (e: Exception) {
         println("Invalid entry cause of ${e.cause}")
     }
 }

fun printMid(inputs: MutableList< Pair<String, String> > ) {

        var last = inputs[inputs.size-1]
        var sides = findSides(inputs)
        var mid = Pair("","")
            mid = if (last.second == "L"){
                sides[0]
            }else{
                sides[1]
            }

     println("Mid is ${mid.first}")

    }
    fun findSides (inputs: MutableList<Pair<String, String>>):MutableList<Pair<String, String> >{

        var leftSide : Pair<String,String> = inputs[0]
        var rightSide : Pair<String,String> = inputs[0]
        validateInputs(inputs)

       for (it in 0 until inputs.size-1){

            if (inputs[it].second.uppercase(Locale.getDefault()) == "L"){
                leftSide = inputs[it]
            }
            else if (inputs[it].second.uppercase(Locale.getDefault()) == "R"){
                rightSide = inputs[it]
            }
        }
        return mutableListOf(leftSide,rightSide)
    }

fun validateInputs(inputs: MutableList<Pair<String, String>>):  MutableList<Pair<String, String>> {

    if (inputs[1].second.uppercase(Locale.getDefault()) == "L"
        &&
        inputs[2].second.uppercase(Locale.getDefault()) == "L"
    ) inputs.set(1, Pair( inputs[1].first,"R") )

    else if (inputs[1].second.uppercase(Locale.getDefault()) == "R"
        &&
        inputs[2].second.uppercase(Locale.getDefault()) == "R"
    ) inputs.set(1, Pair( inputs[1].first,"L") )

    return inputs
}
/*

Asghar U
Ali L
Ahmad L
Reza R


 */