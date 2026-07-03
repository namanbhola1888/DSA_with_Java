public class rotateList{

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k % length;
        if(k == 0) return head;

        tail.next = head;

        int steps = length - k - 1;
        ListNode newTail = head;

        for(int i=0; i<steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static ListNode arrayToList(int[] arr){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int i=0; i<arr.length; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        ListNode head = arrayToList(arr);
        rotateList obj = new rotateList();

        ListNode result = obj.rotateRight(head, k);
        System.out.println(result.val);

    }
}
