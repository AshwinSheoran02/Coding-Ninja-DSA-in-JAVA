// Sort an array A using Quick Sort.
// Change in the input array itself. So no need to return or print anything.


// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)

/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		int start = 0;
	        int end = input.length-1;
	        sort(input, start, end);
	}
    public static int partition (int[] arr, int low, int high){
	        int pivot = arr[high];
	        //int i = (low-1);
	        int count = low-1;
	        for(int j = low; j<high; j++){
	            
	            if (arr[j]<pivot){
	                count++;
	                
	                //swap arr[i] and arr[j]
	                
	                int temp = arr[count];
	                arr[count] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        
	        //swap arr[i+1] and pivot
	        
	        int temp = arr[count+1];
	        arr[count+1] = arr[high];
	        arr[high] = temp;
	        
	        return count+1;
	    }
	    
	    
	    public static void sort(int[] arr, int low, int high){
	        if (low<high){
	            int pivot = partition(arr, low, high);
	            sort(arr, low, pivot-1);
	            sort(arr, pivot+1, high);
	        }
	    }
	
}