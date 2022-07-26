import com.sun.tools.javac.Main
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainKtTest {

    private val testSample1: MissingLetter = MissingLetter()

    @Test
    fun testSum() {
        val expected = 'e'
        val chars = arrayOf('a','b','c','d','f')
        assertEquals(expected, testSample1.missingLetter(chars))
    }

    @Test
    fun testSum2() {
        val expected = 'P'
        val chars = arrayOf('O','Q','R','S')
        assertEquals(expected, testSample1.missingLetter(chars))
    }

    @Test
    fun testSum3() {
        val expected = 'x'
        val chars = arrayOf('t','u','v','w','y')
        assertEquals(expected, testSample1.missingLetter(chars))
    }
}