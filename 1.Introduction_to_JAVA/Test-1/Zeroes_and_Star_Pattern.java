// Print the following pattern
// Pattern for N = 4
// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines

import java.util.*;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
             Scanner s = new Scanner(System.in);
             int n = s.nextInt();
             
             for (int i = 0 ; i < n ; i++){
                 //for (int j = 0 ; j < 2*n-1 ;j++){
                     
                     //starting 0
                     for (int k = 0 ; k < i ; k++){
                         System.out.print(0);
                     }
                     //1st *
                     System.out.print("*");
                     //2nd 0
                     for (int k = 0 ; k < n-i-1 ;k++ ){
                         System.out.print(0);
                     }
                     //2nd *
                     System.out.print("*");
                     //3rd 0
                     for (int k = 0 ; k < n-i-1 ;k++ ){
                         System.out.print(0);
                     }
                     //3rd *
                     System.out.print("*");
                     //4th 0
                     for (int k = 0 ; k < i ; k++){
                         System.out.print(0);
                     }
                     System.out.println();
                     
                 //}
                 
             
             
             }
		
	}	
}