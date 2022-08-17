// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// Note : If multiple words are of same length, then answer will be first minimum length word in the string.
// Words are seperated by single space only.
// Input Format :
// String S
// Output Format :
// Minimum length word


public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        int l = input.length();
        String[] arr = input.split(" ");
        int n = arr.length;
        int size = 1000000;
        int index = 0;
        for (int i = 0 ; i < n ; i++){
            if ( arr[i].length() < size ){
                size = arr[i].length();
                index = i;
                
            }
        }
        return (arr[index]);
        

	}
}
