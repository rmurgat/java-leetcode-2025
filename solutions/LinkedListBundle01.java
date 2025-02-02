package solutions;

public class LinkedListBundle01 {
    public ListNode addArray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for(int i=1; i<arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public void printLinkedList(ListNode node) {
        while(node!=null) {
            System.out.printf("%d, ", node.val);
            node = node.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode last = null;

        while (head!=null) {
            ListNode tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
    }    
}
