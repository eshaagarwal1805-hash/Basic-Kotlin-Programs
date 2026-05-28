fun main() {
    println(Largest(5, 7, 2))
}
fun Largest(n1: Int,n2: Int, n3: Int): Int {
	var L: Int
    if (n1 >= n2 && n1 >= n3){
        println("$n1 is the largest number.")
        L=n1
    }
    else if (n2 >= n1 && n2 >= n3){
        println("$n2 is the largest number.")
        L=n2
    }
    else{
        println("$n3 is the largest number.")
        L=n3
    }
    return L
    
}
