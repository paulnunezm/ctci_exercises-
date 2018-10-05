fun main(args: Array<String>) {

    println(urlify_1("Mr John Smith    "))
}

fun urlify_1(input: String): String {
    val spaceString = "%20"
    val array = input.toCharArray()
    val words = input.trim().split(" ")
    val availableSpaces = array.count { it == ' ' }
    val neededSpaces = (words.size - 1) * spaceString.length

    if (neededSpaces <= availableSpaces) {
        var url = ""
        for(i in 0 until words.size - 1){
            url += words[i]+spaceString
        }
        url+=words[words.size-1]
        return url
    }
    return ""
}