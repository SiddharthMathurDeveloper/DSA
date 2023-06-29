/* 

  Brute Force & Optimized -> Time - O(N^2) Space - O(1) 
  
   TAG -> [Two pointer , String ]

   Trick -> To do a reverse of word , keep doing the swap of first (ith) index and last (jth) index till i<=j or i<j till the middle point
  
*/ 


class Solution {
    public String reverseWords(String s) {

        String reversedString = "";

        int sLength = s.length();

        String word = "";

        for(int i=0;i<=sLength;i++){
            if(i== sLength){
              reversedString += ReversedWord(word);
              break;
            }

            if(s.charAt(i)==' '){
                reversedString += ReversedWord(word);
                reversedString+=' ';
                i++;
                word = "";
            }
            
            word+=s.charAt(i);
            

           
        }
        return reversedString;
    }


    public String ReversedWord(String word){
        int wordLength = word.length();
        StringBuilder reversedWord = new StringBuilder(word);


        int i=0;
        int j=wordLength-1;
        
        while(i<=j){
             char leftValue = reversedWord.charAt(i);
             char rightValue = reversedWord.charAt(j);


            reversedWord.setCharAt(i,rightValue );
            reversedWord.setCharAt(j,leftValue);
            i++;
            j--;
        }

        return reversedWord.toString();
        

    }
}
