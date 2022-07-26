import com.sun.tools.javac.Main
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainKtTest {

    private val testSample1: LexicoMinimal = LexicoMinimal()

    @Test
    fun testMin() {
        val expected = ArrayDeque<String>(listOf("A","B","C","A","C","F"))
        var stackJenny = ArrayDeque<String>(listOf("A","C","A"))
        var stackStephanie = ArrayDeque<String>(listOf("B","C","F"))
        assertEquals(expected, testSample1.lexicminimal(stackJenny,stackStephanie))
    }

    @Test
    fun testMin2() {
        val expected = ArrayDeque<String>(listOf("A","B","A","C","F","A"))
        var stackJenny = ArrayDeque<String>(listOf("B","A","C"))
        var stackStephanie = ArrayDeque<String>(listOf("A","F","A"))
        assertEquals(expected, testSample1.lexicminimal(stackJenny,stackStephanie))
    }

    @Test
    fun testMin3() {
        val expected = ArrayDeque<String>(listOf("B","A","D","E","A","B","S","C"))
        var stackJenny = ArrayDeque<String>(listOf("D","E","A","B"))
        var stackStephanie = ArrayDeque<String>(listOf("B","A","S","C"))
        assertEquals(expected, testSample1.lexicminimal(stackJenny,stackStephanie))
    }
}