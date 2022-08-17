// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1


import java.io.*;
public class Solution {


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        
        int n = Integer.parseInt(reader.readLine());
        for (int i = n ; i > 0 ; i--){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

		
	}

}
