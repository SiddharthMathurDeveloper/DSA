class Solution {
    public String reversePrefix(String word, char ch) {
       
        int endIndex = getChIndex(word,ch);

        if(endIndex==-1){
            return word;
        }

        StringBuilder wordReverseTillCh = new StringBuilder();
        wordReverseTillCh.append(word); 

        
        int i=0;
        int j=endIndex;

        while(i<j){ // i<j or i<=j is the same
            char leftCharacter = word.charAt(i);
            char rightCharacter = word.charAt(j);


            wordReverseTillCh.setCharAt(i,rightCharacter);
            wordReverseTillCh.setCharAt(j,leftCharacter );
    

            i++;
            j--;            
        }

        return wordReverseTillCh.toString();
    }
    


    public int getChIndex(String word, char ch){
        int endIndex=-1;
        int wordLength = word.length();

        for(int i=0;i<wordLength;i++){
            if(ch==word.charAt(i)){
                endIndex=i;
                break;
            }
        }


        return endIndex;
    }

}
