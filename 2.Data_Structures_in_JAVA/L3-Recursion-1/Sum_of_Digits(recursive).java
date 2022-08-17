// Write a recursive function that returns the sum of the digits of a given integer.
// Input format :
// Integer N
// Output format :
// Sum of digits of N


public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        if (input == 0)
            return 0;
        return (input % 10 + sumOfDigits(input / 10));

	}
}
