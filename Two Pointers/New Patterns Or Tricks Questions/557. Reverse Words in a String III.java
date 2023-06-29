/* 

  Brute Force & Optimized -> Time - O(N^2) Space - O(1) 
  
   TAG -> [Two pointer , String ]

   Trick -> To do a reverse of word , keep doing the swap of first (ith) index and last (jth) index till i<=j or i<j till the middle point
  
*/ 


class Solution {
    public String reverseWords(String s) {

        String reversedString = ""; // The result string 

        int sLength = s.length(); // Take the length of the string 

        String word = ""; // Init the word with empty string

        for(int i=0;i<=sLength;i++){ // Loop till Length included becase "abcd def" if not then def we will not be able to get def in same loop, althought we will have the string def but a new loop has to made 
            if(i== sLength){ // if index== string length 
              reversedString += ReversedWord(word); // call the method  ReversedWord which Reverses the word
              break; // when done come out of the loop
            }

            if(s.charAt(i)==' '){ // when there is space we have the can word 
                reversedString += ReversedWord(word); // call the method  ReversedWord which Reverses the word
                reversedString+=' '; // add empty string after it 
                i++; // increase i to avoid ' '
                word = ""; // make word empty again for new word to come
            }
            
            word+=s.charAt(i); //everytime append the character of s to word expect ' ' empty char
            

           
        }
        return reversedString; // return the answer
    }


    public String ReversedWord(String word){
        int wordLength = word.length(); // Take word length
        StringBuilder reversedWord = new StringBuilder(word); // To Make a word


        int i=0; // pointer one at index start
        int j=wordLength-1; // pointer one at index last
        
        while(i<=j){ //loop over the word string and swap the word for reversal
             char leftValue = reversedWord.charAt(i);  // take character from start / i value
             char rightValue = reversedWord.charAt(j); // take character from end / j value

        // swap value [1,2,3,4,5] -> [5,2,3,4,1] (Swapping)
            reversedWord.setCharAt(i,rightValue ); // swap left/start character with right/end character
            reversedWord.setCharAt(j,leftValue); // swap right/end character with left/start character
            i++; // move i foward
            j--;  // move j foward
        }

        return reversedWord.toString(); // return the result in string form
        

    }
}
