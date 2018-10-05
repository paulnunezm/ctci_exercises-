fun main(args: Array<String>) {

    val string = "qwertyuiopasdfghjk" // with unique characters
    val string2 = "qwertyuioopasdfghjk" // without unique characters

    println(checkIfUnique(string))
    println(checkIfUnique(string2))
}

private fun checkIfUnique(string: String): Boolean {
    if(string.length > 128) return false

    val hash = HashMap<String, Int>()

    for (character in string) {
        if(hash.containsKey(character.toString())){
            return false
        }
        hash.put(character.toString(), 1)
    }

    return true
}