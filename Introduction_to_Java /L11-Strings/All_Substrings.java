// For a given input string(str), write a function to print all the possible substrings.
// Substring
// A substring is a contiguous sequence of characters within a string. 
// Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.



public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int l =str.length();
        for (int i = 0 ; i < l ; i++){
            for (int j = i ; j <= l ; j++){
                String s1 = str.substring(i, j);
                System.out.println(s1);
            }
        }
	}

}