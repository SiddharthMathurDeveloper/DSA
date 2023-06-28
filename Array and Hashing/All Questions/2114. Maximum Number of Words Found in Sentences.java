

class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxi=0;
        for(String sentence:sentences){
            int words = countWordInSentence(sentence);
            maxi = Math.max(words,maxi);
        }

        return maxi;

    }

    public int countWordInSentence(String sentence){
            int count = 1;
            for(char letter:sentence.toCharArray()){
                if(letter==' '){
                    count++;
                }
            }
            return count;
    }
}
