fun main(args: Array<String>) {

    val matrix = arrayOf(arrayOf(1, 2, 3, 4), arrayOf(5, 6, 7, 8), arrayOf(5, 6, 7, 8),arrayOf(9,10,11,12))
    ifMatrixNxN(matrix) {
        printMatrix(it)
    }
}

private fun rotateMaxtrixIn90Deg(array: Array<Array<Int>>): Array<Array<Int>> {
    println("rows: ${array.size}")
    println("columns: ${array[0].size}")


    return emptyArray()
}

private fun printMatrix(array: Array<Array<Int>>) {
    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            print("${array[i][j]} ")
        }
        println("")
    }
}

fun ifMatrixNxN(matrix: Array<Array<Int>>, listener: (Array<Array<Int>>) -> Unit) {
    val rows = matrix.size
    val columns = matrix[0].size
    val sameSize = (0 until matrix.size).all { columns == matrix[it].size }

    if (rows == columns && sameSize) {
        listener(matrix)
    } else {
        throw IllegalStateException("Matrix must be NxN")
    }
}


