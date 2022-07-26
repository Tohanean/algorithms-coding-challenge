class EvenSum {
    fun evenSum(array: Array<Int>) : Int
    {
        var i:Int = 0
        var sum:Int = 0
        for(i in 0..array.size-1 step 1)
        {
            println(array[i])
        }

        for(i in 0..array.size-1 step 1)
        {
            if(array[i]%2==0)
            {
                sum += array[i]
            }
        }
        return sum
    }
}