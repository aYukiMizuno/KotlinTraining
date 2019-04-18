package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class SampleTest {
    @Test
    fun testWelcome() {
        // welcome()
        // fizzbuzz()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
        // hello()
    }

    @Test
    fun testIsLeapYear() {
        val no = listOf(1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600)
        val yes = listOf(1600, 2400, 2000)
        for (y in yes) {
            assertEquals(true, isLeapYear(y), "fail: $y")
        }
        for (y in no) {
            assertEquals(false, isLeapYear(y), "fail: $y")
        }
    }

    @Test
    fun testPowerInt() {
        assertEquals(1, powerInt(0, 0))
        assertEquals(1, powerInt(1, 0))
        assertEquals(0, powerInt(0, 1))
        assertEquals(1, powerInt(1, 1))

        assertEquals(256, powerInt(2, 8))
    }

    @Test
    fun testPower() {
        assertEquals(1.0, power(0.0, 0))
        assertEquals(1.0, power(1.0, 0))
        assertEquals(0.0, power(0.0, 1))
        assertEquals(1.0, power(1.0, 1))

        assertEquals(256.0, power(2.0, 8))
        assertEquals(128.0, power(2.0, 7))
        assertEquals(32.0, power(2.0, 5))

        assertEquals(2216_83782.0, Math.floor(power(1.5, 19) * 100000))
    }

    @Test
    fun testEvenOdd(){
        assert(1.isOdd())
        assert(5.isOdd())
        assert((-5).isOdd())

        assert(!1.isEven())
        assert(!5.isEven())
        assert(!(-5).isEven())

        assert(2.isEven())
        assert(4.isEven())
        assert((-4).isEven())
        assert(0.isEven())

        assert(!2.isOdd())
        assert(!4.isOdd())
        assert(!(-4).isOdd())
        assert(!0.isOdd())
    }

    @Test
    fun testDice() {
        var dice = Dice(6)
        for (i in 1..99) {
            val x = dice.roll()
            assert((1..6).contains(x))
        }
        assertFails { dice.roll() }
    }

    @Test
    fun testMyCustomClass() {
        val mcc = MyCustomClass()
        mcc.propertyWithCounter = 0
        mcc.propertyWithCounter = 0
        assertEquals(2, mcc.counter)
        mcc.propertyWithCounter = 0
        assertEquals(3, mcc.counter)

    }

    @Test
    fun testNabe() {
        var na = NabeAtsu()
        val expected = listOf("1", "2", "Aho", "4", "5", "Aho", "7", "8", "Aho", "10", "11", "Aho", "Aho")

        for (e in expected) {
            assertEquals(e, na.next())
        }
    }
}