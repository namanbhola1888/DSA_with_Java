public class removeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 2;

        ListNode head = LinkedListUtils.arrayToList(arr);

        removeFromEnd obj = new removeFromEnd();
        ListNode result = obj.removeNthFromEnd(head, n);

        ListNode temp = result;

        while(temp.next!=null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
}
