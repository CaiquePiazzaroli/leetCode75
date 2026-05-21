package PC01ArrayAndStrings;

class Exercise01Problem1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        int index = (word1Char.length >= word2Char.length) ? word1Char.length : word2Char.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++) {
            if(i < word1Char.length)
                sb.append(word1Char[i]);
            if(i < word2Char.length)
                sb.append(word2Char[i]);
        }
        
        return sb.toString();
    }
}