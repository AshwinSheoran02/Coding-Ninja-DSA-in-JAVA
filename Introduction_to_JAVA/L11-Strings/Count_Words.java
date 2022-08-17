// For a given input string(str), find and return the total number of words present in it.
// It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces.
// Output Format:
// The only line of output prints an integer value denoting the tool number of words present in the string.


public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
        int count = 0;
        if (str.length()==0){
            return 0;
        }
        for (int i = 0 ; i < str.length() ; i++){
            if ( (str.charAt(i))== ' '){
                count++;
            }
        }
        
        return (count+1);
	}

}