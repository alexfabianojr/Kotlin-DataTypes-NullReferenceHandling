import java.math.BigDecimal

fun main() {

    val names = arrayOf("John", "Alex", "Teo")

    val longs1 = arrayOf(1L, 2L, 3L)

    val longs2 = arrayOf<Long>(1, 2, 3)

    println(names.get(2))
    println(names[2])

    val evenNumbers = Array(16) { n -> n * 2}

    println(evenNumbers.size)

    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(1000) {n -> n + n * 3}

    for (number in lotsOfNumbers) {
        println(number)
    }

    val lotsOfZeros = Array(20) {0}

    for (number in lotsOfZeros) {
        println(number)
    }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        println(number)
    }

    someArray = Array(30) {n -> ((n + n) * n ) / ((n - (n / 3)) + 1)}

    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("Alex", 1, 4L, BigDecimal.valueOf(10.5), 'a', 43.2)

    println(mixedArray is Array<*>)

    for (thing in mixedArray) {
        println(thing)
    }

    val myIntNumbers = intArrayOf(1, 2, 3, 4, 5)

    DummyJavaClass.printNumbers(myIntNumbers)
    DummyJavaClass.printNumbers(evenNumbers.toIntArray())

    val someOtherIntArray = IntArray(5) //initialize with five zeros

    for (number in someOtherIntArray) println(number)




}