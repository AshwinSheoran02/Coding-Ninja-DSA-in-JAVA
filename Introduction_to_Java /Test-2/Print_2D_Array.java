// Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
// Input format :
// Line 1 : No of rows (n) and no of columns (m) (separated by single space)
// Line 2 : Row 1 elements (separated by space)
// Line 3 : Row 2 elements (separated by space)
// Line 4 : and so on


public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
        int r = input.length;
        int c  = input[0].length;
        
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < r-i ; j++){
                for (int k = 0 ; k < c ; k ++){
                    System.out.print(input[i][k]+" ");
                }
                System.out.println();
            }
        }

	}
}