// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in ascending order.


// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

// The second line contains 'N' single space separated integers representing the elements of the first the array/list.

// The third line contains an integer 'M' representing the size of the second array/list.

// The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// For each test case, print the intersection elements in a row, separated by a single space.

// Output for every test case will be printed in a separate line.

import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length)
        {
            if (arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        
        
	}
    
    public static int[] bubbleSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
        return arr;
	}

}