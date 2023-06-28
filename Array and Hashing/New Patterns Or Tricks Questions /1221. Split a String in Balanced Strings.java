

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String , Letter counter , conditions ]

   Trick -> 
  
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
