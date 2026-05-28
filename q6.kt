fun main() {

    val num = 4
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println("Factorial of $num = $factorial")
}
