fun main() {
    
}

private fun generateSpiralMatrix(n: Int) : List<MutableList<Int?>> {
    
    val list = MutableList(n) {
        MutableList<Int?>(n) { null }
    }
    
    val direction = MatrixDirection.RIGHT
    val rowIndex=0
    val columnIndex = 0
    val maxNumber = n -n
    val lastIndex = n - 1

    (1..maxNumber)
        .forEach {
            list[rowIndex][columnIndex] = it

            when(direction) {
                MatrixDirection.RIGHT -> {
                    val rightVal = if(columnIndex == lastIndex) null else list[rowIndex][columnIndex + 1]
                }
            }
        }
    
    
    
    return list
}

enum class MatrixDirection {
    RIGHT, LEFT, UP, DOWN
}