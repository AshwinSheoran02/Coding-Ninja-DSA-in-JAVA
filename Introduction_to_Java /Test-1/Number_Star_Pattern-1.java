// // Print the following pattern for given number of rows.
// // Input format :
// // Integer N (Total number of rows)
// // Output Format :
// // Pattern in N lines

// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

import java.util.Scanner;


public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner (System.in);
    	int n = s.nextInt();
        int star = 1;
        for (int i = 0 ; i < n ; i ++){
            
            for ( int j = n ; j >=1 ; j--){
                if (j ==star){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
                
            }
            star = star+1;
            System.out.println();
            
        }
        
        

	}
}
