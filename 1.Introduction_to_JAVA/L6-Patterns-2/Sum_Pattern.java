// Write a program to print triangle of user defined integers sum.


import java.io.*;

public class Main {


	public static void main(String[] args) throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        int flag = 1;
        
        for (int i = 1 ; i <=n ; i++){
            int sum = 0;
            
            for (int j =1 ; j <= flag ; j ++ ){
                System.out.print(j);
                int plus = 0;
            	if(plus<i-j){
                System.out.print("+");
                    plus= plus+1;
                }
                sum = sum + j;
                
            }
            System.out.print("=");
            System.out.print(sum);
            
            System.out.println();
            flag = flag +1;
        }
		
	}

}
