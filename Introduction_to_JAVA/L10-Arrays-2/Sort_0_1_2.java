// You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
// 'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
// Note:
// You need to change in the given array/list itself. Hence, no need to return or print anything. 
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
// Output Format :
// For each test case, print the sorted array/list elements in a row separated by a single space.

// Output for every test case will be printed in a separate line.

public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int l = arr.length;
        int temp[] = new int[l];
        int z=0;
        int o = 0;
        int t=0;
        for (int i = 0 ; i < l; i++){
            if (arr[i]==0){
                z++;
            }
            if (arr[i]==1){
                o++;
            }
            if (arr[i]==2){
                t++;
            }
        }
            for (int i = 0 ; i < l ; i++){
                if (z>0 ){
                    arr[i]=0;
                    z--;
                    continue;
                }
                if (o>0 ){
                    arr[i]=1;
                    o--;
                    continue;
                }
                if (t>0 ){
                    arr[i]=2;
                    t--;
                    continue;
                }
            }
        
    }

}