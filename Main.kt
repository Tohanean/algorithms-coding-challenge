fun main() {
    val even: EvenSum = EvenSum()
    val N:Int = 10
    var array = Array<Int>(N){0}
    //array.forEach { array[it] = readLine()!!.toInt() }
    for(i in array.indices){array[i] = readLine()!!.toInt()}
    println(even.evenSum(array))
}