// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String


public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        String str  = input;
       		if (str.length() == 0)
            {
                return "";
            }

    if (str.charAt(0) == 'x')
        {

            return  removeX(str.substring(1));
        }
 

    return str.charAt(0) +
            removeX(str.substring(1));
            
	}
}
