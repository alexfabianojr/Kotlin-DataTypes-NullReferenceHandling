
fun main(args: Array<String>) {

    val myInt = 10
    var myLong = 10L

    myLong = myInt.toLong()

    myLong = myInt.plus(myLong)

    val myByte: Byte = 111

    var myShort: Short

    myShort = myByte.toShort()

    val myDouble = 324.21

    println(myDouble is Double)

    var myFloat = myDouble.toFloat()

    myFloat = 3120.2f

    val myChar = 'a'

    println(myChar is Char)

    //using java class inside kotlin

    val onVacationText = DummyJavaClass().isVacationTime(false)

    println(onVacationText)

    val anyThing: Any   

}