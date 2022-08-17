// For a given a string(str), find and return the highest occurring character.
// Example:
// Input String: "abcdeapapqarr"
// Expected Output: 'a'
// Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
// If there are two characters in the input string with the same frequency, return the character which comes first.
// Consider:
// Assume all the characters in the given string to be in lowercase always.
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces.
// Output Format:
// The only line of output prints the updated string. 

public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int[] arr = new int[125];
        int l = str.length();
        for (int i = 0 ; i < l ; i++ ){
            int index = (int)(str.charAt(i));
            //System.out.println(index);
            arr[ index ]  =arr[ index  ]+1 ;
        }
        // for (int i = 0 ; i < 125 ; i++ ){
        //     System.out.print(arr[i]+ " ");
        // }
        int count = 0;
        int ind = 0;
        for (int i = 0 ; i < 125 ; i++ ){
            if (arr[i]>count){
                count = arr[i];
                ind = i;
            }
        }
        char c = (char)ind;
        return c ;
        
	}

}