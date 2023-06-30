

/* 

  Brute Force & Optimized -> Time - O(N+M) Space - O(1) 
  
   TAG -> [ Two pointer(Same Direction) , String , Alternately Move  ]

   Trick -> If i is less string1 length than then keep moving i++ and append to ans string ,If j is less string2 length than then keep moving j++ and append to ans string , if i or j becomes
             more than the string length stop appending to ans for that pointer on the string , as Out of index will come
  
*/ 


// -------------------------------- |  Bigger Version [shorter below]

class Solution {
    public String mergeAlternately(String word1, String word2) {

        int word1Length = word1.length(); // 
        int word2Length = word2.length();

       StringBuilder mergedString = new StringBuilder();

        int i=0;
        int j=0;
       

        while(i<word1Length || j<word2Length){
            
            if(i>=word1Length){
                while(j<word2Length){
                     mergedString.append( word2.charAt(j) );
                     j++;
                }
                return mergedString.toString();
            }

             if(j>=word2Length){
                while(i<word1Length){
                    mergedString.append (word1.charAt(i) );
                    i++;
                }
                return mergedString.toString();
            }
            
            mergedString.append( word1.charAt(i) );
            mergedString.append( word2.charAt(j)  );
            i++;
            j++;
            

        }

        return mergedString.toString();
        
    }
}






// -------------------------------- |  Shorter version [Does the same thing]


class Solution {
    public String mergeAlternately(String word1, String word2) {

        int word1Length = word1.length();
        int word2Length = word2.length();

       StringBuilder mergedString = new StringBuilder();

        int i=0;
        int j=0;
       

        while(i<word1Length || j<word2Length){
            

            if(i < word1Length){ // till i is less than length 
                mergedString.append(word1.charAt(i));
                i++;
            }

            if(j<word2Length){ // till j is less than length 
                mergedString.append(word2.charAt(j));
                j++;
            }
        }


        return mergedString.toString();
        
    }
}
