// Given a string, determine if it is a palindrome, considering only alphanumeric characters.
// Palindrome
// A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
// Example:
// If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

// The expected output for this example will print, 'true'.
// From that being said, you are required to return a boolean value from the function that has been asked to implement.
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// The only line of output prints either 'true' or 'false'.



public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int l = str.length();
        int i = 0 ;
        int j = l-1;
        while ( (i!= l-1)  ){
            if( str.charAt(i) != str.charAt(j) ){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
	}

}