/*
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5
..*
.***
*****
.***
..*

The dots represent spaces.

*/

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
        
        for (int i = 1 ; i <=n ; i= i+2){
            for (int j = 0 ; j < n - i ; j = j+2 ){
                System.out.print(" ");
            }
            for (int j =1 ; j <= i ; j ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n ; i >1 ; i = i-2){
            for (int j = n-i+1  ; j > 0 ; j = j-2 ){
                System.out.print(" ");
            }
            for (int j =i - 1 ; j > 1 ; j -- ){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
		
	}

}
