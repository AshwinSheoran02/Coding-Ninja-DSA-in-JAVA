// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'N' column values separated by a single space.
// Output format:
// For each test case, print the single integer denoting the sum.

// Output for every test case will be printed in a seperate line.



public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here\
        int sum = 0;
        int r = mat.length;
        int c= 0;
        if ( r>0){
        c = mat[0].length;
        }
        System.out.print("");
        for (int i = 0  ; i < r; i++){//left most
            sum =sum + mat[i][0];
        }
        //System.out.println(sum);
        for (int i = 0  ; i < r; i++){//right most
            sum =sum + mat[i][c-1];
        }
        //System.out.println(sum);
        for (int i = 1  ; i < c-1; i++){//top most
            sum =sum + mat[0][i];
        }
        //System.out.println(sum);
        for (int i = 1  ; i < c-1; i++){//bottom most
            sum =sum + mat[r-1][i];
        }
        //System.out.println(sum);
        for (int i = 1  ; i < r-1; i++){//1st diagonal
            for (int j = 1  ; j< c-1 ; j++){
                if (i==j){
                sum = sum + mat[i][j];
                //System.out.println("mat[i][j] "+mat[i][j]);
                }
            }
            
        }
        //System.out.println(sum);
        for (int i = 1  ; i < r-1; i++){//2nd diagonal
            for (int j = c-1 ; j>0 ; j--){
                if (((i + j) == (r - 1)) &&(i!=j) ){
                sum = sum + mat[i][j];
                }
            }
        }
        System.out.println(sum);
        
        
        
	}

}