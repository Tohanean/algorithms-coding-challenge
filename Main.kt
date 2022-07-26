
fun main() {
    val minimalString: LexicoMinimal = LexicoMinimal()
    var stackJenny = ArrayDeque<String>(listOf("A","C","A"))
    var stackStephanie = ArrayDeque<String>(listOf("B","C","F"))
    println(minimalString.lexicminimal(stackJenny,stackStephanie))
}