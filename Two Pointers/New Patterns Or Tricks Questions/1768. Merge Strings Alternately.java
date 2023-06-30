class Solution {
    public String mergeAlternately(String word1, String word2) {

        int word1Length = word1.length();
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
