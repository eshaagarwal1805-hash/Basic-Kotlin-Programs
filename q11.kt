fun main() {
    var n = 12345
    var sum = 0
	println("Number: $n")
    while (n != 0) {
        var digit = n % 10
        sum += digit
        n /= 10
    }
    
    println("Sum of Digits: $sum")
}
