/* 
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        
        String str  = s.nextLine();
        
        String arr[]= str.split(" ");
        int b = Integer.valueOf(arr[0]);
        String g = arr[1];
        
        
        int allow= 0;
        double hra = (0.20f * b) ;
        double da = (0.50f * b);
        double pf  = (0.11f * b);
        //System.out.println(g);
        if (g.charAt(0) == 'A'){
            allow = 1700;
            //System.out.println("allow changed");
        }
        if (g.charAt(0) == 'B'){
            allow = 1500;
        }
        if(g.charAt(0) != 'A' && g.charAt(0) != 'B' )  {
            allow = 1300;
        }
        // System.out.println(b);
             // System.out.println(hra);
             //     System.out.println(da);
             //    System.out.println(allow);
             //     System.out.println(pf);
        System.out.println(Math.round( b + hra +da +allow - pf ));

	}
}
