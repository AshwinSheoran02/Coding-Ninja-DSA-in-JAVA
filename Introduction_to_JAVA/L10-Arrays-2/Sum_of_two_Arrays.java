// Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
// You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
// Note:
// The sizes N and M can be different. 

// Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

// No need to print the elements of the output array/list.
// Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements of the first array/list.

// Third line contains an integer 'M' representing the size of the second array/list.

// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output Format :
// For each test case, print the required sum of the arrays/list in a row, separated by a single space.

// Output for every test case will be printed in a separate line.


public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int num1 = 0;
        int num2 = 0;
        int l1= arr1.length;
        int l2 = arr2.length;
        for (int i = 0 ; i < l1  ; i++){
            int a = (int)(Math.pow(10,l1- i-1));
            num1 = num1 + arr1[i]*a;
            // System.out.println(num1);
        }
        for (int i = 0 ; i < l2 ; i++){
            int a = (int)(Math.pow(10,l2 - i-1));
            num2 = num2 + arr2[i]*a;
        }
        // System.out.println(num1);
        // System.out.println(num2);
//         System.out.println(num1+num2);
        
        
        ///
        int x = num1 + num2;
        	String s=Integer.toString( x );
        
        //System.out.println(s);
        int l3 = s.length();
       int k = l3-1;
        int l4= output.length;
        // System.out.println(l1);
        // System.out.println(l2);
        // System.out.println(l3);
        for (int i = l4-1 ; i >=0  ;i--){
            if (k>=0){
            output[i] = Character.getNumericValue((s.charAt(k)));
            k--;
            }
        }
        
        
    }

}