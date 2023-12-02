class Solution {
    public String makeGood(String s) {
        // StringBuilder to build the modified string
        StringBuilder sb = new StringBuilder("");

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Check if StringBuilder is not empty and the current character and the last character in StringBuilder
            // have an absolute ASCII difference of 32 (case difference)
            if (sb.length() != 0 && Math.abs(sb.charAt(sb.length() - 1) - s.charAt(i)) == 32) {
                // Remove the last character from StringBuilder
                sb.deleteCharAt(sb.length() - 1);
                continue;
            }

            // Append the current character to StringBuilder
            sb.append(Character.toString(s.charAt(i)));
        }

        // Convert StringBuilder to String and return the result
        return sb.toString();
    }
}
