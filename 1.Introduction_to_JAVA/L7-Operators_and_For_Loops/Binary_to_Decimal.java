// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        double num = 0;
        
        for (int i = 0 ; i < l ; i++ ){
            if ( str.charAt(i) == '1' ){
                num = num + Math.pow(2 , l-i-1 );
                
            }
        }
        System.out.println((int)(num));

	}
}
