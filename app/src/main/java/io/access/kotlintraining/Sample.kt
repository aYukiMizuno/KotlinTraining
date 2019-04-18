package io.access.kotlintraining

//import android.widget.TabHost
//import android.support.annotation.NonNull


fun welcome() {
    println("welcome to ACCESS!")
}


//


fun hello() {
    println("Hello World!")
}


//


fun fizzbuzz() {
    for (i in 1..100) {
        println(
                when {
                    i % 15 == 0 -> "FizzBuzz"
                    i % 5 == 0 -> "Buzz"
                    i % 3 == 0 -> "Fizz"
                    else -> i.toString()
                }
        )
    }
}


//


fun isLeapYear(year: Int): Boolean =
        when{
            (year % 400 == 0) -> true
            (year % 100 == 0) -> false
            (year % 4 == 0) -> true
            else -> false
        }


//


fun powerInt(a: Int, n: Int): Long {

    if (a < 0 || n < 0)
        error("inputs must be positive. return 0")

    var y = 1L
    for (i in 1..n)
        y *= a

    return y
}


//


fun power(a: Double, n: Int): Double {
    if (a < 0 || n < 0)
        error("inputs must be positive. return 0")

    // 例外
    if (n == 0)
        return 1.0
    if (n == 1)
        return a

    var p = a // 掛ける数
    var m = n // 掛ける回数

    var y = 1.0 // 結果　
    while (0 < m) {
        if (m % 2 == 1) y *= p
        p *= p
        m /= 2
    }

    return y
}


//


fun Int.isOdd() = this.and(1) == 1
fun Int.isEven() = this.and(1) == 0


//


class Dice constructor(private val n: Int) {
    private var life = 100
    fun roll(): Int {
        if ((--life) <= 0) throw Exception("I was broken")
        return 1 + Math.floor(Math.random() * n.toDouble()).toInt()
    }
}


//


class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        set(v) {
            ++counter
            field = v
        }
}


//


class NabeAtsu {
    var cnt = 0

    private fun has3(n: Int): Boolean =
            when {
                n %10 == 3 -> true
                n <= 0     -> false
                else       -> has3(n/10)
            }

    fun next(): String =
            if (++cnt % 3 == 0 || has3(cnt)) "Aho"
            else cnt.toString()
}


//


// no tests
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (message != null)
        client?.personalInfo?.email?.let { mailer.sendMessage(it, message) }
}


// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
