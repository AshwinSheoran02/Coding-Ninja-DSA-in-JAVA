/* Write a program to print all the factors of a number other than 1 and the number itself.
*/

import java.io.*;

public class Solution {
    
    public static void main(String[] args) throws IOException {
        // Write your code here
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

		for (int i = 2 ; i < num ; i++){
            if ( num % i == 0 ){
                System.out.print(i + " ");
            }
        }
 
        
    }
}
