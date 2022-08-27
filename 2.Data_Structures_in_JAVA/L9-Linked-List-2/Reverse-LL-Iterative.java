// Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
//  Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the elements of the updated singly linked list.

/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if (head==null || head.next==null ){
            return head;
        }
        LinkedListNode<Integer> tail = head.next;
        LinkedListNode<Integer> smallnode = reverse_I(head.next);
        
        tail.next = head;
        head.next = null;
        return smallnode;
        
        
        
	}
}