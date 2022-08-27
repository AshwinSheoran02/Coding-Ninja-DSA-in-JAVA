// Given a singly linked list of integers, sort it using 'Merge Sort.'
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the elements of the sorted singly linked list.

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

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if (head ==null){
            return null;
        }
        if ( head.next == null ) 
            return head;
 
         LinkedListNode<Integer> mid = findMid(head);
         LinkedListNode<Integer> head2 = mid.next;
        mid.next = null;
        LinkedListNode<Integer> newHead1 = Solution.mergeSort(head);
        LinkedListNode<Integer> newHead2 = Solution.mergeSort(head2);
        LinkedListNode<Integer> finalHead = Solution.merge(newHead1, newHead2);
 
        return finalHead;
	}
    static LinkedListNode<Integer> findMid( LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static LinkedListNode<Integer> merge( LinkedListNode<Integer> head1,  LinkedListNode<Integer> head2)
    {
       LinkedListNode<Integer> merged = new  LinkedListNode<Integer> (-1);
        LinkedListNode<Integer> temp = merged;
       
        // While head1 is not null and head2
        // is not null
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
       
        // While head1 is not null
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
       
        // While head2 is not null
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

}