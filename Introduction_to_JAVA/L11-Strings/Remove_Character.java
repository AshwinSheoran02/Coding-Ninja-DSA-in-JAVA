// For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
// The input string will remain unchanged if the given character(X) doesn't exist in the input string.
// Input Format:
// The first line of input contains a string without any leading and trailing spaces.

// The second line of input contains a character(X) without any leading and trailing spaces.
// Output Format:
// The only line of output prints the updated string. 


public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        StringBuffer sb = new StringBuffer();
 
        // 1. convert String to StringBuffer
        // using append() method
        // sb.append(str);
        int l = str.length();
        for (int i = 0 ; i < l ; i++){
            if (str.charAt(i) != ch){
                sb.append(str.charAt(i));
                
            }
        }
        return sb.toString();
	}

}