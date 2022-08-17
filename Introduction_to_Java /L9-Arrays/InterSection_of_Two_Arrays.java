// Intersection of Two Arrays II
// Send Feedback
// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in the order they appear in the first array/list(ARR1)


// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements of the first the array/list.

// Third line contains an integer 'M' representing the size of the second array/list.

// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// For each test case, print the intersection elements in a row, separated by a single space.

// Output for every test case will be printed in a separate line.


public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int l1 = arr1.length;
        int l2 = arr2.length;
        int c1 = l1;
        int c2 = l2;
        
        
        for (int i = 0 ; i <l1 ; i++){
            for(int j = 0 ; j < l2 ; j++){
                if (arr1[i]==arr2[j] ){
                    System.out.print(arr1[i]+" ");
                    //arr1 = removeTheElement( arr1, i);
                    arr2 = removeTheElement( arr2, j);
                    c1--;
                    c2--;
                    break;
                    
                    
                }
            }
        }
        
    }
    
    public static int[] removeTheElement(int[] arr, int index)
    {

        if (arr == null || index < 0
            || index >= arr.length) {
 
            return arr;
        }

        int[] anotherArray = new int[arr.length];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }
 
}