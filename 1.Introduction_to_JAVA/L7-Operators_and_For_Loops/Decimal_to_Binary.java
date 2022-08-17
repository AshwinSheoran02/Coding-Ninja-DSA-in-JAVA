// Given a decimal number (integer N), convert it into binary and print.
// The binary number should be in the form of an integer.
// Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


// Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


// Input format :
// Integer N
// Output format :
// Corresponding Binary number (long)

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String s1 ="0";
        String c="";
        if(n>0){
            s1="";
        }
        while (n >0){
            
            int x = n % 2;
            c = Integer.toString(x);
            s1 = c+s1;
            n = n / 2;
            
        }
        System.out.println(s1);
        
        
	}
}
