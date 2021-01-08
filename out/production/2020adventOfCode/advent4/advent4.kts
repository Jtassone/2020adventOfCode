import java.io.File

data class Passport (val byr: String, val iyr: String, val eyr: String, val hgt: String,val hcl: String,val ecl: String, val pid: String, val cid : String?)

File("input.txt").useLines { lines -> lines.forEach {
    println(it.length)
} }
