/*

Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/



import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = (s.nextInt());
        int step = s.nextInt();
        int x;
 

        
        
        for (int i = start ; i<= end ; i= i + step ){
            System.out.print(i+" ");
         double y = (  (   (double)5/9)*(i-32)   );
            x = (int)y;
            System.out.println(x);
        }

		
	}

}
