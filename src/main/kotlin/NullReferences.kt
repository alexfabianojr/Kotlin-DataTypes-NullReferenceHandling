import java.util.*

fun main() {

    // ? permite que o valor aceite null (nullable) safe operator
    val str1: String? = null

    val str2: String? = "This isn't null"

    if (str2 != null) {
        str2.uppercase()
    }

    str2?.uppercase()

    println(
        "What happens when we do this will a str1: "
                + str1?.uppercase()
    ) //shows null / it doesn't throw null pointer

    //Elvis operator: it lets you assign a default value when an expression evaluates to null

    val str3 = str1 ?: "This is the default value" //Works like a ternary operator to validate (if null)

    println(str3)

    val someArray: Any = arrayOf(1, 2, 3, 4)
    val str4 = someArray as? String

    println(str4?.uppercase())

    val str5: String? = "Not null but may be in future"

    str5?.let { printText(str5) } //'let' is equivalent to if not null do this

    str5!!.uppercase() //if you want to throw null pointer to handle it uses !!

}

fun printText(str: String) {
        println(str)
}