package LinkedList;

public class DeletetheMiddleNodeofaLinkedList {

//
//    You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
//
//    The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
//
//    For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
//
//
//            Example 1:
//
//
//    Input: head = [1,3,4,7,1,2,6]
//    Output: [1,3,4,1,2,6]
//    Explanation:
//    The above figure represents the given linked list. The indices of the nodes are written below.
//    Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
//    We return the new list after removing this node.
//            Example 2:
//
//
//    Input: head = [1,2,3,4]
//    Output: [1,2,4]
//    Explanation:
//    The above figure represents the given linked list.
//    For n = 4, node 2 with value 3 is the middle node, which is marked in red.
//    Example 3:
//
//
//    Input: head = [2,1]
//    Output: [2]
//    Explanation:
//    The above figure represents the given linked list.
//    For n = 2, node 1 with value 1 is the middle node, which is marked in red.
//    Node 0 with value 2 is the only node remaining after removing node 1.





    public static ListNode deleteMiddle(ListNode head) {

        if (head.next == null)
            return null;

        ListNode l1 = head,l2 = head;

        int count=0;

        while(l1 !=null){
            count++;
//            System.out.println(l1.val);
            l1 = l1.next;
        }

        int mid = count/2;

        for (int i = 0; i < mid-1; i++) {
            l2 = l2.next;
        }

        l2.next = l2.next.next;

         return head;
    }

    public static void main(String[] args) {
//        [1,3,4,7,1,2,6]
        ListNode head = new ListNode(1);

        head.next = new ListNode(3);

        ListNode l1 = head.next;
        l1.next = new ListNode(4);
        ListNode l2 =l1.next;
        l2.next=new ListNode(7);
        ListNode l3 = l2.next;
        l3.next=new ListNode(1);
        ListNode l4 = l3.next;
        l4.next = new ListNode(2);
        ListNode l5 =l4.next;
        l5.next=new ListNode(6);
        ListNode l6 =l5.next;
        l6.next=null;

        ListNode listNode = deleteMiddle(head);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
