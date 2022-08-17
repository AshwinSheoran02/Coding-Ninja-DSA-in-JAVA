// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 21
// 321
// 4321

import java.io.*;

public class Solution {


	public static void main(String[] args)throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        
        for (int i = 0 ; i <= n ; i++){
            for (int j = i ; j >0 ; j --){
                System.out.print(j);
            }
            System.out.println();
        }

		
	}

}
