// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
// Note :
// If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output Format :
// For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
// OR
// If column sum is maximum, then print: "column" <col_index> <col_sum>
// It will be printed in a single line separated by a single space between each piece of information.

// Output for every test case will be printed in a seperate line.


public class Solution {

	public static void findLargest(int[][] mat) {
		//Your code goes here
        int r = mat.length;
        int c = 0;
        int largest = -2147483648;
        int row = 0;
        int index = 0;
        if (r>0){
        c = mat[0].length;
        }
        System.out.print("");
        
        //row wise sum
        for (int i = 0 ; i < r ; i ++){
            int sum = 0;
            for (int j = 0 ; j < c ; j ++){
                sum =sum+mat[i][j];
            }
            if (sum> largest){
                largest = sum;
                row =1;
                index = i;
            }
        }
        
        //column wise sum
        for (int i = 0 ; i < c ; i ++){
            int sum = 0;
            for (int j = 0 ; j < r ; j ++){
                sum =sum+mat[j][i];
            }
            if (sum> largest){
                largest = sum;
                row =0;
                index = i;
            }
        }
        if ((row==1) || (r==0 && c==0)  ){
            System.out.print("row "+ index+" " +largest);
        }
        else{
            System.out.print("column "+ index+" " +largest);
        }
        
        
        
	}

}