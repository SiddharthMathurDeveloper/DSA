/* 

   Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [Two pointer(Opposite Direction) , String ]

   Trick -> 
  
*/ 

class Solution {
    public String reversePrefix(String word, char ch) {
       
        int endIndex = getChIndex(word,ch); // Get the index of the of the character we want from this function

        if(endIndex==-1){ // if endIndex get a -1 value from  getChIndex they return -1 element not found
            return word; // return the word itself
        }

        StringBuilder wordReverseTillCh = new StringBuilder(); // A string form
        wordReverseTillCh.append(word); // append the given word to wordReverseTillCh

        
        int i=0; // start
        int j=endIndex; // end

         // loop will till have a range(0, index of given word)
       
        while(i<j){ // i<j or i<=j is the same
            char leftCharacter = word.charAt(i);  // get value from start
            char rightCharacter = word.charAt(j); // get value from end

            //Swap values
            wordReverseTillCh.setCharAt(i,rightCharacter); // make ith (start) value end value (overwrite it)
            wordReverseTillCh.setCharAt(j,leftCharacter ); // make jth (end) value start value (overwrite it)
    

            i++; // increase the value / move fowards
            j--; // decrease the value / move backwards   
        }

        return wordReverseTillCh.toString();
    }
    


    public int getChIndex(String word, char ch){ // function to get the value of that ch 
        int endIndex=-1; // init the variable with -1 ,if we find the value it will get replaced if not will return -1 meaning not found
        int wordLength = word.length(); // get the length of word

        for(int i=0;i<wordLength;i++){ //loop till end
            if(ch==word.charAt(i)){ // if found the character
                endIndex=i; // make endIndex to that index of that found element
                break; // stop the loop
            }
        }

        return endIndex; // return the value 
    }

}
