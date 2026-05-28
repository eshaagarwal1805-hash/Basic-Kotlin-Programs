fun main() {
    var start = 1
    val end= 50

    while (start < end) {
        if (checkPrimeNumber(start))
            print(start.toString() + " ")

        ++start
    }
}

fun checkPrimeNumber(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }

    return flag
}
