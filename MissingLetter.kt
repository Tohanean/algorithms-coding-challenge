class MissingLetter {
    fun missingLetter(array: Array<Char>): Char {
        var executableLetter:Char = array[0];
        for(letter:Char in array) {
            if(letter != executableLetter) break;
            executableLetter++;
        }
        return executableLetter;
    }
}