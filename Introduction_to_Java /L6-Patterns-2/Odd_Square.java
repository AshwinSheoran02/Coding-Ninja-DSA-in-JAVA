// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135


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
       int[] arr = new int[n];
        int ind = 0;
        for (int j =1 ; j <= 2*n ; j =j+2 ){
                arr[ind] = j;
            ind ++;
            }
            
        
        for (int i = 1 ; i <=n ; i++){
            
            for (int j = 0 ; j < n ; j++){
                System.out.print(arr[j]);
            }
            
            int[] temp = new int[n];
            for (int j =0 ; j < n ; j++ ){
                temp[j] = arr[j];
            }
            for (int j = 0 ; j < n-1 ; j++){
                arr[j]=temp [j+1];
            }
            arr[n-1] = temp[0];
            
            
            
            
            
            System.out.println();
        }
		
	}

}
