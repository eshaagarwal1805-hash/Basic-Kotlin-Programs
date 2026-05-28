fun main() {
    var count = 0
    var num = 1245

    while (num != 0) {
        num /= 10
        ++count
    }

    println("Number of digits: $count")
}
