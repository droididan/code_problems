fun main() {
//    print(revese4("hello"))
//    fizzbuzz(1..100)
//    print(palidrome("abba"))

}

fun reverse1(n: String): String {
    return n.split("").reduce { acc, s -> s + acc }
}

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

fun palindrome(str: String) =
    str == str.split("").reversed().joinToString("")
