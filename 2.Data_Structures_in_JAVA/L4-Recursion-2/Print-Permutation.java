// Given an input string (STR), print all possible permutations of the input string.
// Note:
// The input string may contain the same characters, so there will also be the same permutations.
// The order of permutations doesn’t matter.
// Input Format:
// The only input line contains a string (STR) of alphabets in lower case
// Output Format:
// Print each permutations in a new line

public class Solution {
    private static void print(String input,String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        
        for(int i=0;i<input.length();i++){
            String str = input.substring(0,i) + input.substring(i+1,input.length());    
            print(str , output + input.charAt(i));
        }
        
        // input = input.substring(1);
        // print(input,output);
        
        
    }

	public static void FindPermutations(String str) {
		// Write your code here
         print (str,"");
        //return output;
            //printPermutn(ros);

	}
    
}
