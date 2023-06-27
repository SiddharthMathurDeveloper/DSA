


class Solution {
    public String truncateSentence(String s, int k) {
        int word = 0;
        String truncatedString = "";

        for (char letter : s.toCharArray()) {
            
            if (letter == ' '){
                word++;  
            }

            if (word == k) {
                break;
            }
            truncatedString += letter;

        }
        return truncatedString;
        
    }
}
