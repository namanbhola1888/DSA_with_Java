public class detectCycle{

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
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

        detectCycle obj = new detectCycle();
        System.out.println(obj.hasCycle(head));
    }
}