package q_1

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    val result = isPalindromePermutation("Tact Coa")
    print(result)
}


/**
 *  For it to be a palindrome it must be a string with odd length of characters
 *  and it must be only one odd character count
 *
 *  Optimized: do both operations at the same iteration
 */
fun isPalindromePermutation(input: String): Boolean {
    val lowerCasedInput = input.toLowerCase()
    val characterCounter = Array(128, { 0 }) // ASCII character list
    var numberOfCharacters = 0

    var oddCount = 0
    for (i in 0 until lowerCasedInput.length) {
        if (lowerCasedInput[i] != ' ') {
            val char = lowerCasedInput[i].toInt()
            numberOfCharacters++
            characterCounter[char] ++

            if (characterCounter[char] % 2 != 0) {
                oddCount++
            } else {
                oddCount--
            }
        }
    }
    if (numberOfCharacters % 2 == 0) return false
    return  oddCount <= 1
}