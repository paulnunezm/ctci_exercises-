fun main(args: Array<String>) {
    println(getCompressedString("aabcccccaaabv"))
}

fun getCompressedString(s: String): String {
    var characterCounter = 1
    val stringBuilder = StringBuilder()

    for (i in 0 until s.length) {
        if (i < s.length - 1) {
            if (s[i] == s[i + 1]) {
                characterCounter++
            } else {
                stringBuilder.append("${s[i]}$characterCounter")
                characterCounter = 1
            }
        } else {
            stringBuilder.append("${s[i]}$characterCounter")
        }
    }

    val compressedString = stringBuilder.toString()
    return if (s.length < compressedString.length) {
        s
    } else {
        compressedString
    }
}