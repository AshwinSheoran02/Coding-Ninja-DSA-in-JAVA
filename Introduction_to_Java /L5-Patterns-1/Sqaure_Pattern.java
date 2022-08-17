// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444

import java.io.*;

public class Solution {


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        
        for (int i = 0 ; i < num ; i++){
            for (int j = 0 ; j < num ; j++){
                System.out.print(num);
            }
            System.out.println();
        }

		
	}

}
