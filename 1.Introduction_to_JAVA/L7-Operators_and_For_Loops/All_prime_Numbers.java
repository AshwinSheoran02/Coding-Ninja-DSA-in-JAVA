// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// Print the prime numbers in different lines.


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
        System.out.println(2);
       
        for (int i = 2 ; i <= n ; i ++ ){
            int flag = 0;
            for (int j = 2 ; j < i ; j++){
                if (i%j==0){
                    flag=0;
                    break;
                }
                else{
                    flag = 1;
                }
            }
            if (flag == 1){
                System.out.println(i);
            }
        }
        
        
        
		
	}

}
