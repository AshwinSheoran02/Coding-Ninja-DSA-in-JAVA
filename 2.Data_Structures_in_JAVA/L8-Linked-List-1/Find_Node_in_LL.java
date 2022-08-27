// You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N' (if it exists). Return -1 otherwise.
// Note :
// Assume that the Indexing for the singly linked list always starts from 0.
// Input format :
// The first line contains an Integer 'T' which denotes the number of test cases. 

// The first line of each test case or query contains the elements of the singly linked list separated by a single space. 

// The second line contains the integer value 'N'. It denotes the data to be searched in the given singly linked list.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence -1 would never be a list element.
// Output format :
// For each test case, return the index/position of 'N' in the singly linked list. Return -1, otherwise.

// Output for every test case will be printed in a separate line

/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        if(head==null)
            return -1;
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null && temp.data!=n)
        {
            temp=temp.next;
            count++;
        }
        if(temp!=null)
            return count;
        else
            return -1;
        
        
	}
}