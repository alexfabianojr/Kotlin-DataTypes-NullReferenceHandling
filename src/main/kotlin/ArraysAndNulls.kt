fun main() {

    val nullableInts = arrayOfNulls<Int?>(5)

    nullableInts[2] = 79

    for (i in nullableInts) {
        println(i)
    }
}