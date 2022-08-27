// You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the singly linked list separated by a single space. 

// The second line contains the integer value 'N'. It denotes the number of nodes to be moved from last to the front of the singly linked list.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
// For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        LinkedListNode<Integer> node=head,checkNode=null,newHead=null;
        if (n==0)
        {
            return head;
        }
        
        int count=0;
        while(node!=null)
        {
            node=node.next;
            count=count+1;
        }
        if (count<n)
        {
            return head;
        }
        
        n=count-n;
        node=head;
        for (int i=0;i<n-1;i++)
        {
            node=node.next;
        }
        checkNode=node.next;
        node.next=null;
        newHead=checkNode;
        //System.out.println("Shifting from element: "+checkNode.data);
        //System.out.println("Now last element is: "+node.data);
        //System.out.println("Now first element is: "+newHead.data);
        while(checkNode.next!=null)
        {
            checkNode=checkNode.next;
        }
        checkNode.next=head;
        head=newHead;
        return head;



	} 

}