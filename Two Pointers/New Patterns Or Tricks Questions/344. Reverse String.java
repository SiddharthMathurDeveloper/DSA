
/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [ Two pointer(Same Direction) , String , Swapping ]

   Trick ->
  
*/ 

class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

      
        while(i<j){
            char leftValue = s[i];
            char rightValue = s[j];

            s[i] = rightValue;
            s[j] = leftValue;
            i++;
            j--;
        }

       return;
    }
}
