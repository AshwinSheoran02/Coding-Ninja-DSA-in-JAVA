// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.


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
        System.out.println("*");
        for (int i = 1 ; i <=n ; i++){
			System.out.print("*");
            for (int j =1 ; j <= i ; j ++ ){
                System.out.print(j);
            }
            for (int j =i-1 ; j >= 1 ; j -- ){
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = n-1 ; i >=1 ; i--){
			System.out.print("*");
            for (int j= 1 ; j <= i-1 ; j ++ ){
                System.out.print(j);
            }
            for (int j =i ; j >= 1 ; j -- ){
                System.out.print(j);
            }
            
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
		
	}

}
