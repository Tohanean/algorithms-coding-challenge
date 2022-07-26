 fun main() {
        val missing: MissingLetter = MissingLetter()
        var i: Int = 0
        var array = Array<Char>(26){ ' ' }

        for (i in 0..4 step 1) {
            array[i] = readLine()!!.first()
        }
        for (i in 0..array.size - 1 step 1) {
            println(array[i])
        }

        println(missing.missingLetter(array))
    }
