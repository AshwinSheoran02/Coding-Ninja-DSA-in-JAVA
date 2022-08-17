// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format :
// String in a single line
// Output format :
// Word wise reversed string in a single line


public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        
        String[] arr = input.split(" ");
        int l = arr.length;
        int k = l-1;
        
        String[] ans = new String[l];
        for (int i = 0 ; i < l ; i++){
            ans[k]=arr[i];
            k--;
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
}
