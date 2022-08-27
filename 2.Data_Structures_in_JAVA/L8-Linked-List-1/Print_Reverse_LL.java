// You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
// To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
// Note :
// You can’t change any of the pointers in the linked list, just print it in the reverse order.
//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
// Remember/Constraints :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
// For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.

// Output for every test case will be printed in a seperate line.


/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
	LinkedListNode<Integer> smallOutput=printReverseRecursion(root);
	}
    
    public static LinkedListNode<Integer> printReverseRecursion(LinkedListNode<Integer> node)
    {
        if (node==null)
            return node;
        LinkedListNode<Integer> smallOutput=printReverseRecursion(node.next);
        System.out.print(node.data+" ");
        return smallOutput;
	}

}