class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class middleOfLL{

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode arrayToList(int[] arr){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        int[] head = {1,2,3,4,5};

        ListNode list = arrayToList(head);
        middleOfLL obj = new middleOfLL();

        ListNode mid = obj.middleNode(list);

        System.out.println(mid.val);
    }
}