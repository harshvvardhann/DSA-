package LinkedList.SinglyLinkedList;

class MergeTwoSortedLL {
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        ListNode current = list2;
        ListNode newNode = new ListNode(-1);
        ListNode dummy = newNode;
        while(temp!=null && current!=null){
            if(temp.data<=current.data){
                dummy.next = temp;
                temp = temp.next;
            }else{
                dummy.next = current;
                current = current.next;
            }
            dummy = dummy.next;
        }

        if(temp!=null){
            dummy.next = temp;
        }

        if(current!=null){
            dummy.next = current;
        }

        return newNode.next;
    }
}