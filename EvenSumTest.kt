import com.sun.tools.javac.Main
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainKtTest {

    private val testSample1: EvenSum = EvenSum()

    @Test
    fun testSum() {
        val expected = 30
        val num = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertEquals(expected, testSample1.evenSum(num))
    }

    @Test
    fun testSum2() {
        val expected = 76
        val num = arrayOf(2,4,3,5,20,1,8,19,42,13)
        assertEquals(expected, testSample1.evenSum(num))
    }

    @Test
    fun testSumRepeatingValues() {
        val expected = 8
        val num = arrayOf(2,2,2,5,5,5,5,5,2,5)
        assertEquals(expected, testSample1.evenSum(num))
    }

    @Test
    fun testSumAllOdd() {
        val expected = 0
        val num = arrayOf(1,1,3,3,3,5,5,7,9,1)
        assertEquals(expected, testSample1.evenSum(num))
    }

    @Test
    fun testSumEmptyArray() {
        val expected = 0
        val num = emptyArray<Int>()
        assertEquals(expected, testSample1.evenSum(num))
    }
}