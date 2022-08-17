// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
// Input format :
// Integer x
// Output format :
// Terms of series (separated by space)


import java.io.*;

public class Main{


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
       int count = 0;
        int i = 1 ;
        while (count<n){
            int x = 3*i +2;
            if ( x % 4 !=0 ){
                count = count +1;
                
                System.out.print( x + " " );
            }
            i = i+1;
        }
		
	}

}
