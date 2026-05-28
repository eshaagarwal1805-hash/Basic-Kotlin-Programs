fun main() {
    val n = 10
    var t1 = 0
    var t2 = 1
    
    print("First $n terms of the fibonnaci series: ")

    for (i in 1..n) {
        print("$t1 ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}
