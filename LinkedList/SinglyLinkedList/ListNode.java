package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

class PalindromeLinkedList {
    class ListNode {
        int data;
        ListNode next;
        ListNode prev;
    
        ListNode(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        
        while(temp!=null){
            a.add(temp.data);
        }

        int left = 0;
        int right = a.size()-1;
        while(left<=right){
            if(a.get(left++) != a.get(right--)) return false;
        }
        return true;
    }

    // This approach is efficient
    public boolean isPalindrome2(ListNode head) {
        if(head == null || head.next == null) return true;

        //find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the remaining half of the linked list..
        ListNode current = slow;
        ListNode next = null;
        ListNode prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        //now compare the first half with the second half of the linked list
        ListNode start = head;
        while(prev!=null){
            if(start.data != prev.data) return false;
            start = start.next;
            prev = prev.next;
        }
        return true;
    }
}
// This approach is showing memory limit exceed... bcoz if the length of linked list is very much long then it will lead to O(N) space...
