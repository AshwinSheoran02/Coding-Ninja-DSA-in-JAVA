// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
// Permutations of each other
// Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

// Example: 
// str1= "sinrtg" 
// str2 = "string"

// The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
// Input Format:
// The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

// The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
// Note:
// All the characters in the input strings would be in lower case.
// Output Format:
// The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

// You are not required to print anything. It has already been taken care of. Just implement the function. 



public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int l1 = str1.length();
        int l2 = str2.length();
        
        int[] arr1 = new int[125];
        for (int i = 0 ; i < l1 ; i++ ){
            int index = (int)(str1.charAt(i));
            //System.out.println(index);
            arr1[ index ]  =arr1[ index  ]+1 ;
        }
        
        int[] arr2 = new int[125];
        for (int i = 0 ; i < l2 ; i++ ){
            int index = (int)(str2.charAt(i));
            //System.out.println(index);
            arr2[ index ]  =arr2[ index  ]+1 ;
        }
        
        for (int i = 0 ; i < 125 ; i ++){
            if (arr1[i]!=arr2[i] ){
                return false;
            }
        }
        return true;
        
	}

}