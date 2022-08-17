// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
// Example:
// Input Sentence: "Hello, I am Aadil!"
// The expected output will print, ",olleH I ma !lidaA".
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
// Output Format:
// The only line of output prints the sentence(string) such that each word in the sentence is reversed. 


public class Solution {
	public static String reverseEachWord(String input) {
		// Write your code here
        
        String[] arr = input.split(" ");
        int l = arr.length;
        int k = l-1;
        
        String[] ans = new String[l];
        for (int i = 0 ; i < l ; i++){
            for (int j = 0; j < arr[i].length() ; j++ ){
                ans[i] = rev(arr[i]);
            }
        }
//         for (int i = 0 ; i < l ; i++){
//             System.out.print(ans[i]+" ");
            
//         }
//         return " ";
        StringBuffer sb = new StringBuffer();
      for(int i = 0; i < l; i++) {
         sb.append(ans[i]);
          sb.append(" ");
      }
      String str = sb.toString();
        return str;

	}
    
    public static String rev(String str){
        String nstr="";
        char ch;

        	for (int i=0; i<str.length(); i++)
              {
                ch= str.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string
              }
        return nstr;
        
        
    }
}
