

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String]

   Trick -> Get the freq of elements put in hashmap these freq will n then to get the sum put in formula of [sum of nth number of same kind((n*(n-1))/2)]
  
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
