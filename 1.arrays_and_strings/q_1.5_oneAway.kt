fun main(args: Array<String>) {

    println(isOneEditAway("pale", "palexx"))
    println("================")

}

fun isOneEditAway(s1: String, s2: String): Boolean {
    if (isDiffGreaterThanOne(s1, s2)) {
        return false
    }

    val firstString: String
    val secondString: String

    if (s1.length == s2.length) {
        if(s1 == s2){
            return false
        }
        firstString = s1
        secondString = s2
    } else {
        firstString = getShorterString(s1, s2)
        secondString = getLongerString(s1, s2)
    }

    var fsIndex = 0
    var ssIndex = 0

    // get if they're one diff away
    var hasOneDiff = false
    while (fsIndex < firstString.length && ssIndex < secondString.length) {
        val c1 = firstString[fsIndex]
        val c2 = secondString[ssIndex]
        if (c1 != c2) {
            if (hasOneDiff) { // has two diffs
                return false
            }
            hasOneDiff = true

            // if the strings are the same length and have only one difference
            // all the others should be the same. We can jump the letter checked
            // and compare both strings with the next
            if(firstString.length == secondString.length) {
                fsIndex++
            }
            ssIndex++
        }else{
            fsIndex++
            ssIndex++
        }
    }
    return true
}

fun isDiffGreaterThanOne(s1: String, s2: String): Boolean {
    return Math.abs(s1.length - s2.length) > 1
}

fun getShorterString(s1: String, s2: String): String {
    return if (s1.length < s2.length) {
        s1
    } else {
        s2
    }
}

fun getLongerString(s1: String, s2: String): String {
    return if (s1.length > s2.length) {
        s1
    } else {
        s2
    }
}

