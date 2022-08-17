// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


// Input format :
// Integer N
// Output format :
// // Corresponding reverse numbera


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        
        int l = s1.length();
        String newx = "";
        char ch;
        
        for(int i = 0 ; i < l ; i++){
            ch= s1.charAt(i); //extracts each character
        	newx = ch+newx;
        }
        int x =Integer.parseInt(newx);  
        System.out.println(x);
	}
}
