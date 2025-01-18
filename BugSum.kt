fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sum()
    println(sum) // Output: 15

    val emptyList = emptyList<Int>()
    val emptySum = emptyList.sum()
    println(emptySum) // Output: 0

    val stringList = listOf("a", "b", "c")
    // val stringSum = stringList.sum() // This will cause a compilation error
}