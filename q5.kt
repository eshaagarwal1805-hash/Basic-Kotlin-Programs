fun main() {
    var num = 121
    var reversed = 0
    var r: Int
    val original = num

    while (num != 0) {
        r = num % 10
        reversed = reversed * 10 + r
        num /= 10
    }
    if (original == reversed)
        println("$original is a palindrome.")
    else
        println("$original is not a palindrome.")
}
