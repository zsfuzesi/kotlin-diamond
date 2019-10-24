package hu.fuz.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DiamondTest {

    @Test
    fun toStringTest_1() {
        val diamond = Diamond(1)
        Assertions.assertEquals("1",diamond.toString())
    }


    @Test
    fun generateTestRow_1() {
        val diamond = Diamond(1)
        Assertions.assertEquals(
                "1",diamond.generateNumbersString(1))
    }

    @Test
    fun generateTestRow_2() {
        val diamond = Diamond(1)
        Assertions.assertEquals(
                "121",diamond.generateNumbersString(2))
    }

    @Test
    fun generateTestRow_5() {
        val diamond = Diamond(1)
        Assertions.assertEquals(
                "123454321",diamond.generateNumbersString(5))
    }

    @Test
    fun toStringTest_2() {
        val diamond = Diamond(2)
        Assertions.assertEquals(
                """ | 1
                    |121
                    | 1
                """.trimMargin(),diamond.toString())
    }


    @Test
    fun toStringTest_5() {
        val diamond = Diamond(6)
        Assertions.assertEquals(
                """ |     1
                    |    121
                    |   12321
                    |  1234321
                    | 123454321
                    |12345654321
                    | 123454321
                    |  1234321
                    |   12321
                    |    121
                    |     1
                """.trimMargin(),diamond.toString())
    }
}