fun main() {
   println(isVowel('E'))
}

fun isVowel(c: Char): Boolean {
    return when (c.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}
