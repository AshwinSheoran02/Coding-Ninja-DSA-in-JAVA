// Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
// An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
// For example,
// 371, as 3^3 + 7^3 + 1^3 = 371
// 1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
// Input Format :
// Integer n
// Output Format :
// true or false


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner (System.in);
    	String s1 = s.nextLine();
        int l = s1.length();
        double sum = 0;
        for (int i = 0 ; i < l ; i++){
            int a = Character.getNumericValue( s1.charAt(i) );
            sum =sum + Math.pow(a, l);
        }
        int fin = Integer.parseInt( (s1));
        if (fin == (int)sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    

	}
}
