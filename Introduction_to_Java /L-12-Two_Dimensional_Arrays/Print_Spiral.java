// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
// a. First row(left to right)
// b. Last column(top to bottom)
// c. Last row(right to left)
// d. First column(bottom to top)
//  Mind that every element will be printed only once.

//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output format :
// For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

// Output for every test case will be printed in a seperate line.



public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int r = matrix.length;
        int c = 0;
        if (r>0){
            
            c = matrix[0].length;
        }
        int x = 0 ;
        int y = 0;
        int right = c;
        int bottom = r;
        int left = 0;
        int top =0;
        while ( (x < r) && (y < c)  ) {
            
            for (int i = y ; i < c ; i++){
                System.out.print(matrix[x][i] +" " );
            }
            x++;
            
            for (int i = x ; i < r ; i++){
                System.out.print( matrix[i][c-1]+" " );
            }
            c --;
            
            if (x < r){
 
            for (int i = c - 1 ; i >= y; i--){
                //print(a[m - 1][i], end=" ")
                    System.out.print( matrix[r-1][i] +" ");
            }
            r--;  
            }
            if (y < c) {
                for (int i = r - 1; i >= x; --i) {
                    System.out.print(matrix[i][y] + " ");
                }
                y++;
            }
            
            
        }
            
        
	}
}