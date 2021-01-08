import java.io.File

var lineCount: Int = 0

data class Slope (var x: Int, var y: Int, var count: Long = 0, var currentX: Int = 0, var currentY: Int = 0)

var incrementList = listOf<Slope>(Slope(1,1,), Slope(3, 1), Slope(5, 1), Slope(7, 1), Slope(1, 2))

File("input3.txt").useLines { lines -> lines.forEach {
    val lineArray: CharArray = it.toCharArray()
    incrementList.forEach {
        with(it) {
            if (lineCount % y != 0) {
                println("Skipping this line")
            } else {
                if (lineArray[currentX] == "#".single()) count++
                currentY += y
                currentX += x
                currentX %= lineArray.size

            }
        }
    }
    lineCount+=1
} }
