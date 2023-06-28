

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String , Letter counter ]

   Trick -> Loop over the again string when u find ' '(space) word++ when word value==k then break
  
*/ 



class Solution {
    public int balancedStringSplit(String s) {
        int countRight=0;
        int countLeft=0;

        int maximumBalanceStrings=0;

        for(char value:s.toCharArray()){

            if(value=='R'){
                countRight++;
            }

            if(value=='L'){
                countLeft++;
            }

            if(countRight==countLeft){
                maximumBalanceStrings+=1;
                countRight=0;
                countLeft=0;
            }
        } 

        return  maximumBalanceStrings;
    }
}
