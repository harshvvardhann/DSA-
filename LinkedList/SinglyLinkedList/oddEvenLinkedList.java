package LinkedList.SinglyLinkedList;
class oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode headeven = evenNode;

        while(evenNode!=null && evenNode.next!=null){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = headeven;
        return head;
    }
}