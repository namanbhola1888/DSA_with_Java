public class LinkedListUtils {

    public static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }

        return dummy.next;
    }
}