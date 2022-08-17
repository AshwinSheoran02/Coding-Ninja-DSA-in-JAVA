// Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
// Constraints :
// 1 <= |S| <= 50
// where |S| represents the length of string S. 
// Sample Input 1 :
// xpix
// Sample Output :
// x3.14x

public class solution {

	// Return the changed inputing
	public static String replace(String input){
		// Write your code here
         if (input.length() <= 1) {
            return input;
        }
 
        // if the first character is 'p'
        // and the first character of the part
        // passed to recursion is 'i' then replace
        //"pi" with "3.14"
        if (input.charAt(0) == 'p' && input.length() >= 2
            && input.charAt(1) == 'i') {
            return "3.14" + replace(input.substring(2, input.length()));
        }
 
        // if the first character is not 'p'
        // then just put that character in
        // front of the answer which came
        // from recursion
        return input.charAt(0) + replace(input.substring(1, input.length()));
    

	}
}
