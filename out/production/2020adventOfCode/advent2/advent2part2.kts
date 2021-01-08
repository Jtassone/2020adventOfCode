import java.io.File

var numValid: Int = 0

fun String.isValid() {
    val splitString = this.split(" ")
    val splitOnDash = splitString[0].split("-")
    val conditionCountLower = splitOnDash[0].toInt()
    val conditionCountUpper = splitOnDash[1].toInt()
    val conditionLetter = this.split(":")[0].split(" ")[1].toCharArray()[0]
    val password = splitString[2]
    val charAtLowerIndex = password[conditionCountLower - 1]
    val charAtUpperIndex = password[conditionCountUpper - 1]
    if (charAtLowerIndex == conditionLetter && charAtUpperIndex != conditionLetter) numValid++
    if (charAtLowerIndex != conditionLetter && charAtUpperIndex == conditionLetter) numValid++
}

File("input2.txt").useLines { lines -> lines.forEach { it.isValid()} }

println(numValid)
