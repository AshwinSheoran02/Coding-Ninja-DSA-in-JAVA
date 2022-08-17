/* 
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner (System.in);
        String a = s.nextLine();
        int l = a.length();
        int even=0;
        int odd=0;
        for (int i = 0 ; i < l ; i++){
            int x = Character.getNumericValue(a.charAt(i));
            if (x%2==0){
                even = even + x;
            }
            else{
                odd = odd +x;
                
            }
        }
        System.out.println(even + " "+ odd);

	}
}
