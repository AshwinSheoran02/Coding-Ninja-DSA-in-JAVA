// For a given string(str), remove all the consecutive duplicate characters.
// Example:
// Input String: "aaaa"
// Expected Output: "a"

// Input String: "aabbbcc"
// Expected Output: "abc"
//  Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// The only line of output prints the updated string.


public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        int l = str.length();
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toString(str.charAt(0)));
        //String s =str.charAt();
        for (int i = 1 ; i < l ; i++){
            if(str.charAt(i) != str.charAt(i-1) ){
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString(); 
	}

}