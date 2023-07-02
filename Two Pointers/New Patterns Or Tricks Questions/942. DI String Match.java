
/*  

   Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
   TAG -> [Two pointer(Opposite Direction) , String , Maths(Index) ]

   Trick -> Make two pointer and start i from 0 and j from end , i increase when I is found and j decrease when D is found , 
            In end last value put either i or j as it always yield have a empty not used
  
*/ 


class Solution {
    public int[] diStringMatch(String s) {
        int Slength = s.length(); // Get the length of the given string
        int [] intFormOfPermutation = new int[Slength+1]; // To store the result/ans

        int valueForI=0; // start from start
        int valueForD=Slength; // start from end

        int index=0; // index for ans array
      
        for(char letter:s.toCharArray()){ // loop over the string
          
            if(letter=='I'){ //When 'I' is found 
              
                intFormOfPermutation[index] = valueForI; // put the value of valueForI into ans array
              
                valueForI++; // increase the valueForI for new value 
            }
              
            else{ //When 'D' is found 
              
                intFormOfPermutation[index] = valueForD; // put the value of valueForD into ans array
              
                valueForD--; // increase the valueForI for new value 
            }
            index++; // Increase the index to move to next for ans array
        }

        

        intFormOfPermutation[index] = valueForI; // give and put the last remaining value of valueForI also u can give valueForD in ans array
      
        return intFormOfPermutation; // return the ans

        
    }
}
