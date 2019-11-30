 // given an array and chunk size, divide the array into many subarrays
 // where each subarray is of length size

fun main() {
    val list1 = arrayListOf(1,2,3,4)
    val list2 = arrayListOf(1,2,3,4,5)


//    print(list1.asSequence().batch(2))
    print(chunk(list1,2))
}

 fun chunk(array: List<Int>, size: Int): List<Int> {
     val chunked = mutableListOf<Int>()
     var index = 0

     while (index < array.size) {
         chunked.addAll(array.subList(index, index + size))
         index += size
     }

     return chunked.toList()
 }

 fun <T> Sequence<T>.batch(n: Int): Sequence<List<T>> {
     return BatchingSequence(this, n)
 }

 private class BatchingSequence<T>(val source: Sequence<T>, val batchSize: Int) : Sequence<List<T>> {
     override fun iterator(): Iterator<List<T>> = object : AbstractIterator<List<T>>() {
         val iterate = if (batchSize > 0) source.iterator() else emptyList<T>().iterator()
         override fun computeNext() {
             if (iterate.hasNext()) setNext(iterate.asSequence().take(batchSize).toList())
             else done()
         }
     }
 }