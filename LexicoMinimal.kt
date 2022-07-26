class LexicoMinimal {
    fun  lexicminimal(stack1: ArrayDeque<(String)>,stack2: ArrayDeque<(String)>) : ArrayDeque<String>
    {
        var stack = ArrayDeque<String>()
        println(stack1.first())
        println(stack2.first())
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if(stack1.isEmpty())
            {
                stack.add(stack2.removeFirst())
            }
            else if (stack2.isEmpty())
            {
                stack.add(stack1.removeFirst())
            }
            else if (stack1.first() <= stack2.first())
            {
                stack.add(stack1.removeFirst())
            }
            else
                stack.add(stack2.removeFirst())
        }
        return stack
    }
}