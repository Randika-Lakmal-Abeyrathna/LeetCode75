package LinkedList;

public class ReverseLinkedList {


//    Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//
//
//            Example 1:
//
//
//    Input: head = [1,2,3,4,5]
//    Output: [5,4,3,2,1]
//    Example 2:
//
//
//    Input: head = [1,2]
//    Output: [2,1]
//    Example 3:
//
//    Input: head = []
//    Output: []


    public static ListNode reverseList(ListNode head) {

        ListNode newList = null;

        while(head!=null){
            ListNode nextList = head.next;
            head.next = newList;
            newList = head;
            head = nextList;

        }


        return newList;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);

        ListNode l1 = head.next;
        l1.next = new ListNode(3);
        ListNode l2 =l1.next;
        l2.next=new ListNode(4);
        ListNode l3 = l2.next;
        l3.next=new ListNode(5);
        ListNode l4 = l3.next;
        l4.next = null;


        ListNode listNode = reverseList(head);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
