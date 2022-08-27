// You have been given two sorted(in ascending order) singly linked lists of integers.
// Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
// Note :
// Try solving this in O(1) auxiliary space.

// No need to print the list, it has already been taken care.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space. 

// The second line of the input contains the elements of the second sorted singly linked list separated by a single space. 
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output :
// For each test case/query, print the resulting sorted singly linked list, separated by a single space.

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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        
        LinkedListNode<Integer>  merged = new LinkedListNode<Integer> (-1) ;
        LinkedListNode<Integer>  temp = merged  ;
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