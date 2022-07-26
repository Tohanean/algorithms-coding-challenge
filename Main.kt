fun main() {
    val even: EvenSum = EvenSum()
    val N:Int = 10
    var array = Array<Int>(N){0}
    for(i in 0 ..array.size-1 step 1)
    {
        array[i] = readLine()!!.toInt()
    }
    println(even.evenSum(array))
}