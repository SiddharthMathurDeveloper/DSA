class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
            boolean result = validPalindromicString(word);

            if(result){
                return word;
            }
        }

        return "";
    }


    private boolean validPalindromicString(String word){
        int i=0;
        int j=word.length()-1;
       

        while(i<j){
            char startCharacter = word.charAt(i);
            char endCharacter = word.charAt(j);
            if( startCharacter!=endCharacter  ){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }




}
