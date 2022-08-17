// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE


import java.io.*;
public class Solution {
	public static void main(String[] args) throws IOException {
		//Your code goes here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt (  reader.readLine());
        
        for (int i = 1 ; i <= num ; i++){
            for (int j = num - i ; j < num  ; j++){
                System.out.print((char)('A' + j   ));
            }
            System.out.println();
        }
        
	}
}