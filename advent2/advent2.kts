import java.io.File

var numValid: Int = 0

fun String.isValid() {
    val splitString = this.split(" ")
    val splitOnDash = splitString[0].split("-")
    val conditionCountLower = splitOnDash[0].toInt()
    val conditionCountUpper = splitOnDash[1].toInt()
    val conditionLetter = this.split(":")[0].split(" ")[1]
    val password = splitString[2]
    password.count{ it == conditionLetter.toCharArray()[0] }
    if (password.count{ it == conditionLetter.toCharArray()[0] } in conditionCountLower..conditionCountUpper) numValid++
}

File("input2.txt").useLines { lines -> lines.forEach { it.isValid()} }

println(numValid)

