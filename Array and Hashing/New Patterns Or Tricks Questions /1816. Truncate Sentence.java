

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String , Counter ]

   Trick -> Loop over the again string when u find ' '(space) word++ when word value==k then break
  
*/ 


class Solution {
    public String truncateSentence(String s, int k) {
        int word = 0;
        String truncatedString = "";

        for (char letter : s.toCharArray()) {
            
            if (letter == ' '){
                word++;  
            }

            if (word == k) {
                break;
            }
            truncatedString += letter;

        }
        return truncatedString;
        
    }
}
