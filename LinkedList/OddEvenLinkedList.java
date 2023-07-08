package LinkedList;

public class OddEvenLinkedList {

//    Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
//
//    The first node is considered odd, and the second node is even, and so on.
//
//    Note that the relative order inside both the even and odd groups should remain as it was in the input.
//
//    You must solve the problem in O(1) extra space complexity and O(n) time complexity.
//    Example 1:
//    Input: head = [1,2,3,4,5]
//    Output: [1,3,5,2,4]
//    Example 2:
//    Input: head = [2,1,3,5,6,4,7]
//    Output: [2,3,6,7,1,5,4]




    public static ListNode oddEvenList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode odd=head;
        ListNode even =head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd =odd.next;
            even.next = odd.next;
            even =even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
//        [2,1,3,5,6,4,7]
        ListNode head = new ListNode(2);

        head.next = new ListNode(1);

        ListNode l1 = head.next;
        l1.next = new ListNode(3);
        ListNode l2 =l1.next;
        l2.next=new ListNode(5);
        ListNode l3 = l2.next;
        l3.next=new ListNode(6);
        ListNode l4 = l3.next;
        l4.next = new ListNode(4);
        ListNode l5 =l4.next;
        l5.next=new ListNode(7);
        ListNode l6 =l5.next;
        l6.next=null;

        ListNode listNode = oddEvenList(head);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
