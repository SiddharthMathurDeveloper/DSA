

/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [String , Letter counter , conditions ]

   Trick -> If you observe the pattern of getting substrings then u will notice every pattern as equal R and L , So from this observesation I can say that when R==L the count then we have found a Valid String 
  
*/ 


// eg "RRLLRL" ans-> 2 observe the first substring RRLL R2==L2 the second R1==L1 so everytime when both becomes equal we have found it 

class Solution {
    public int balancedStringSplit(String s) {
        int countRight=0; // To count Right R
        int countLeft=0; // To count Right L

        int maximumBalanceStrings=0; // The result

        for(char value:s.toCharArray()){ // loop over the given string

            if(value=='R'){ // If R countRight ++
              
                countRight++;
            }

            if(value=='L'){ // If L countLeft ++
              
                countLeft++;
            }

            if(countRight==countLeft){ // When Equal we have found the string 
              
                maximumBalanceStrings+=1; // increase the result by one 
              
                countRight=0; // make them zero as new are in search of new string 
              
                countLeft=0;
            }
        } 

        return  maximumBalanceStrings;
    }
}
