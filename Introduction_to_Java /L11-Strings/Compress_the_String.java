// Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
// Example:
// If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

// The string is compressed only when the repeated character count is more than 1.
// Note:
// Consecutive count of every character in the input string is less than or equal to 9.
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces.
// Output Format:
// The output contains the string after compression printed in single line.

public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        int l = str.length();
        int count = 1;
        StringBuffer sb = new StringBuffer();
        String s = Character.toString(str.charAt(0));
        for (int i = 1 ; i < l ; i++){
            //System.out.println(str.charAt(i) + " "+s.charAt(0)  );
            if ( str.charAt(i) == s.charAt(0) ){
                count = count+1;
                //System.out.println(i );
                //s = Character.toString(str.charAt(i));
            }
            if ( (str.charAt(i) != s.charAt(0)) || (i==l-1)  ) {
                sb.append( Character.toString(str.charAt(i-1)));
                if (count!=1){
                sb.append(count);
                }
                count = 1;
                s = Character.toString(str.charAt(i));
                //System.out.println("s =" + s  );
                
            }
            
            
        }
        if ((str.charAt(l-1) != str.charAt(l-2)) ){
                sb.append( Character.toString(str.charAt(l-1)));
            }
        return sb.toString();
	}

}