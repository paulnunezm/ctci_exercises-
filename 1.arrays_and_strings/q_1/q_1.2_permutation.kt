package q_1

fun main(args: Array<String>) {
    println(checkIfPermutation2("paulnunez", "nunezpaul")) // permutation
    println(checkIfPermutation("paulnunez", "xnunezpaulx")) // not a permutation

    println(checkIfPermutation2("paulnunez", "xnunezpaulx")) // not a permutation
}


/**
 * String permutation is an anagram of it.
 */
private fun checkIfPermutation(original: String, permutation: String): Boolean {
    if (permutation.length != original.length) {
        return false
    }

    val originalCharacterCounter = Array(128, { 0 })
    val permutationCharacterCounter = Array(128, { 0 })

    for (i in original) {
        originalCharacterCounter[i.toInt()] += 1
    }

    for (i in permutation) {
        permutationCharacterCounter[i.toInt()] += 1
    }

    return (0 until original.length).all {
        originalCharacterCounter[it] == permutationCharacterCounter[it]
    }
}

private fun checkIfPermutation2(original: String, permutation: String): Boolean {
    if(original.length != permutation.length){
        return false
    }
    val x = original.toCharArray().sort()
    val y = permutation.toCharArray().sort()
    return x == y
}