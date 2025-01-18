fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sum()
    println("Sum of list: $sum") // Output: Sum of list: 15

    val emptyList = emptyList<Int>()
    val emptySum = emptyList.sumOrNull() ?: 0
    println("Sum of empty list: $emptySum") // Output: Sum of empty list: 0

    val stringList = listOf("a", "b", "c")
    // Handle the case where sum() is not applicable for this collection type. 
    // Example using fold to illustrate summing non-numeric values is not applicable in this function
    println("String list sum not supported")

    val mixedList = listOf(1, 2, "a", 3, 4, "b")
    val numericSum = mixedList.filterIsInstance<Int>().sum()
    println("Sum of numeric elements in mixed list: $numericSum") // Output: 10
} 