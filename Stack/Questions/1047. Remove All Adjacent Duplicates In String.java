class Solution {
  public String removeDuplicates(String s) {
    // Create a StringBuilder to build the result string without duplicates
    StringBuilder sb = new StringBuilder();

    // Iterate through each character in the input string
    for (char c : s.toCharArray()) {
        // Check if the StringBuilder is not empty and the last character equals the current character
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) { 
            // If true, remove the last character from the StringBuilder to eliminate duplicates
            sb.deleteCharAt(sb.length() - 1);
        } else { 
            // If false, append the current character to the StringBuilder
            sb.append(c);
        }
    }

    // Convert the StringBuilder to a string and return the result without duplicates
    return sb.toString();
  }
}
