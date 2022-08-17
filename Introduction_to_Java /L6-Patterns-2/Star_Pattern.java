// Print the following pattern
// Pattern for N = 4
// ...*
// ..*** 
// .***** 
// *******


// The dots represent spaces.


import java.io.*;

public class Solution {


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        for (int i = 1 ; i <=n ; i++){
            for (int j = 0 ; j < n - i ; j ++ ){
                System.out.print(" ");
            }
            for (int j =1 ; j <= 2*i-1 ; j ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
