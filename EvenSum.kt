class EvenSum {
    fun evenSum(array: Array<Int>) : Int
    {
        var sum:Int = 0
        if(array.isNotEmpty()) {
            //array.forEach { if (array[it]%2==0) sum+= array[it] }
            for(i in array.indices) { if(array[i]%2 == 0) sum+= array[i]}
        }
        return sum
    }
}
