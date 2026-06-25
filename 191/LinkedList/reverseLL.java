public class reverseLL {

    public ListNode reverseList(ListNode head) {

        if(head == null) return head;

        ListNode temp = head.next;
        ListNode prev = head;

        prev.next = null;

        while(temp != null){
            prev = temp;
            temp = temp.next;
            prev.next = head;
            head = prev;
        }

        return prev;
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
        // int[] arr = {1,2,3,4,5};
        int[] arr = {1,2};

        ListNode list = arrayToList(arr);
        reverseLL obj = new reverseLL();

        ListNode result = obj.reverseList(list);
        ListNode temp = result;

        while(temp.next != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print(temp.val);

    }
}
