// For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output format :
// For each test case, print the elements of the two-dimensional array/list in the sine wave order in a single line, separated by a single space.

// Output for every test case will be printed in a seperate line.

public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        //System.out.print("");
        int r  = mat.length;
        int c = 0;
        if (r > 0 ){
        c = mat[0].length;
        }
        int i = 0;
        while(i < c ){
            for (int j =0 ; j < r ; j++){
                System.out.print(mat[j][i] + " " );
            }
            i++;
            if ( i<c){
            for (int j =r-1 ; j >=0 ; j--){
                System.out.print(mat[j][i] + " " );
            }
            }
            i++;
            
            
        }
	}

}