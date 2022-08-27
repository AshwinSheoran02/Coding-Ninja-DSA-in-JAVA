// You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
// Note :
// Assume that the Indexing for the linked list always starts from 0.

// If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
// Illustration :
// The following images depict how the deletion has been performed.
// Image-I :
// Alt txt

// Image-II :
// Alt txt

// Input format :
// The first line contains an Integer 'T' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the linked list separated by a single space. 

// The second line of each test case contains the integer value of 'POS'. It denotes the position in the linked list from where the node has to be deleted.
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the resulting linked list of integers in a row, separated by a single space.

// Output for every test case will be printed in a separate line.
// Note:
// You are not required to print the output, it has already been taken care of. Just implement the function. 


/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        int i = pos;
        
        if(head==null )
            return head;
        if(i==0)
            return head.next;
        int count=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null && count<i-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;
         
        
        return head;
        
	}
}
