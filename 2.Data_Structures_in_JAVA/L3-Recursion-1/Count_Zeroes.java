// Count Zeros
// Send Feedback
// Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
// Input Format :
// Integer N
// Output Format :
// Number of zeros in N


public class solution {

	public static int countZerosRec(int input){
        int n = input;
		if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        /*smaller problem*/
        int lastDigit = n % 10;
        int smallAnswer = countZerosRec(n / 10);
        /*basic calculation*/
        if (lastDigit == 0) {
            return 1 + smallAnswer;
        } else {
            return smallAnswer;
        }
	}
}
