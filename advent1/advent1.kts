import java.io.File

var numArray: MutableList<Int> = mutableListOf<Int>()
var answerMap: HashMap<Int, Int> = HashMap()
File("input.txt").useLines { lines -> lines.forEach { numArray.add(it.toInt()) }}
println(numArray.size)

numArray.forEach {
    if (answerMap[2020 - it] != null) {
        println("Huge success")
        println(answerMap[2020 - it]?.times(it))
    } else {
        answerMap[it] = it
    }
}

// ----------------------------------------------------
// $ kotlinc -script advent1.kts
/**
* loop through the list
* get the number check if 2020 - the number exists in the map if it does return the number and the map entry.
* otherwise add it to the map as 2020 - the number , the number
*
**/