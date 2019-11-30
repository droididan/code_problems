fun main() {
//    print(revese4("hello"))
//    fizzbuzz(1..100)
//    print(palindrome("abba"))
    print("abba".palindrome())
}


fun reverse1(n: String) = n.split("").reduce { acc, s -> s + acc }


fun reverse2(n: String): String {
    var revesed = ""

    for (character in n) {
        revesed = character + revesed
    }

    return revesed
}

fun revese4(n: String) = n.split("").reversed().joinToString("")

fun fizzbuzz(integers: IntRange) {
    for (num in integers) {
        if (num % 3 == 0) println("fizz")
        if (num % 5 == 0) println("buzz")
        if (num % 5 == 0 && num % 3 == 0) println("fizzbuzz")
        else println(num)
    }
}

fun String.palindrome() = this == toCharArray().reversed().joinToString("")

fun generatePyramid(number: Int): MutableList<String> {
    val list = mutableListOf<String>()

    val midPoint = ((2 * number) - 1) / 2
    val columns = (number * 2) - 1

    (0 until number).forEach { row ->
        var rowStr = ""
        (0 until columns).forEach { column ->
            rowStr += if (midPoint - row <= column && midPoint + row >= column) {
                "#"
            } else {
                " "
            }
        }
        list.add(rowStr)
    }

    return list

}

const val vowels = "aeoiu"
fun vowels(str: String) =  str.toLowerCase().count { vowels.contains(it) }

