/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [Two pointer , String ]

   Trick -> Get Min char and overwrite the greater value that index eg . [e,g,c,f,e] -> [e,f,c,f,e] for f,g replace f->g or g<-f any value it will be one step toward being palidrome but question   also asked us to make lexiograhy which can be done using can get min char of the two */
  
*/ 

class Solution {
    public String makeSmallestPalindrome(String s) {
        
        int i = 0; // Start this pointer from start

        int j= s.length()-1; // Start this pointer from end

        char[] charArr = s.toCharArray(); // convert to char Array to overwrite values

        while(i<=j){

            char startIndex = s.charAt(i); // Get character at ith element
            
            char endIndex = s.charAt(j); // Get character at jth element
            
            
              
              // Get Min char of i and j replace the greater value with small value in bid to make Lexicographically Smallest Palidrome
            if(startIndex>endIndex){ 
                charArr[i] = endIndex;
            }
            else if(startIndex<endIndex){
                charArr[j] = startIndex;
            }

            i++; // move i fowards
            j--; // move j backwards
        }


       
        return String.valueOf(charArr); // convert to string and return the ans

        


    }
}
