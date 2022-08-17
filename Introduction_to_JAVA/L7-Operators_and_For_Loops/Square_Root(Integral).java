// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.
// Input format :
// Integer N
// Output Format :
// Square root of N (integer part only)


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for ( int i = 0; i < n ; i++){
            if (Math.pow(i , 2 ) <= n && Math.pow(i+1 , 2)> n ){
                System.out.println(i);
                break;
            }
        }
        if (n == 0){
            System.out.println(0);
        }
	}
}
