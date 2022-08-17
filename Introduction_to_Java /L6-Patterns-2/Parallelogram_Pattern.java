// // Write a program to print parallelogram pattern for the given N number of rows.
// // For N = 4
// ****
// .**** 
// ..**** 
// ...**** 


// // The dots represent spaces.

import java.io.*;

public class Main {


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        for (int i = 1 ; i <=n ; i++){
            for (int j = 1 ; j <  i ; j ++ ){
                System.out.print(" ");
            }
            for (int j =1 ; j <= n ; j ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
