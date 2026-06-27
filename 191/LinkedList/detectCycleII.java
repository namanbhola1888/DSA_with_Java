public class detectCycleII{
    public ListNode detectCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;
        ListNode result = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                result = head;

                while(result != slow){
                    result = result.next;
                    slow = slow.next;
                }
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] arr = {3,2,0,-4};
        
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for(int i=1; i<arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        current.next = head.next;

        detectCycleII obj = new detectCycleII();
        ListNode result = obj.detectCycle(head);
        System.out.println(result.val);
    }
}