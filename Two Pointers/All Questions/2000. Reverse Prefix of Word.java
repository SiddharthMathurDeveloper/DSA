/* 

   Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [Two pointer , String ]

   Trick -> Get Min char and overwrite the greater value that index eg . [e,g,c,f,e] -> [e,f,c,f,e] for f,g replace f->g or g<-f any value it will be one step toward being palidrome but question   also asked us to make lexiograhy which can be done using can get min char of the two */
  
*/ 

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
