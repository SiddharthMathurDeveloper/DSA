
/* 

   Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [Two pointer(Opposite Direction) , String ]

   Trick -> 
  
*/ 

class Solution {
    public int removePalindromeSub(String s) {
        int sLength = s.length();
        int i=0;
        int j=sLength-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return 2;
            }

            i++;
            j--;
        }

        return 1;
    }
}
