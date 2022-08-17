// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String


public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        if (input.length()==0)
        {
            return "";
        }
        String smallOutput=removeX(input.substring(1));
        if (input.charAt(0)=='x')
        {
            return ""+smallOutput;
        }
        else
        {
            return input.charAt(0)+smallOutput;
        }
	}
}
