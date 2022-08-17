// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//     F(n) = F(n-1) + F(n-2), 
//     Where, F(1) =  0, 
//            F(2) = 1
// Provided N you have to find out the Nth Fibonacci Number.

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
    	int[] arr = new int[n];
        
        arr[0]=1;
        if (n>1){
        arr[1]=1;
        }

        
        for (int i = 2 ; i < n ; i ++){
            arr[i] = arr[i-1]+arr[i-2];
            
            
        }
        System.out.println(arr[n-1]);
       
            
            
            
            
       
		
	}

}
