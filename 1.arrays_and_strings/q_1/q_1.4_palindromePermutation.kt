package q_1

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    val result = isPalindromePermutation("Tact Coa")
    print(result)
}

fun isPalindromePermutation(input: String): Boolean {
    val lowerCasedInput = input.toLowerCase()

    val characterCounter = Array(128, { 0 }) // ASCII character list
    var numberOfCharacters = 0

    for (i in 0 until lowerCasedInput.length) {
        if (lowerCasedInput[i] != ' ') {
            numberOfCharacters++
            val char = lowerCasedInput[i].toInt()
            characterCounter[char] += 1
        }
    }

    // for it to be a palindrome it must be a string with odd length of characters
    if (numberOfCharacters % 2 == 0) return false

    // it must be only one odd character count
    var oddCount = 0
    for (i in characterCounter) {
        val characterCount = characterCounter[i]
        if (characterCount % 2 != 0) {
            if (oddCount > 0) {
                return true
            } else {
                oddCount++
            }
        }
    }
    return true
}