// Print the following pattern for the given N number of rows.
// // Pattern for N = 4
// ...1
// ..12
// .123
// 1234
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
            for (int j =1 ; j <= i ; j ++ ){
                System.out.print(j);
            }
            System.out.println();
        }
		
	}

}
