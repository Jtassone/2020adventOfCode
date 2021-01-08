import java.io.File

var numArray: MutableList<Int> = mutableListOf<Int>()
var answerMap: HashMap<Int, Int> = HashMap()
var otherAnswerMap: HashMap<Int, List<Int>> = HashMap()
File("input.txt").useLines { lines -> lines.forEach { numArray.add(it.toInt()) }}
//println(numArray.size)

numArray.sort()
numArray.forEach { answerMap[it] = it }
numArray.forEach {
    var num: Int = 2020 - it
    answerMap.entries.forEach { x ->
    println(x)
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