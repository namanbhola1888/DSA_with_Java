// import java.util.Stack;

public class palindromeLL{

    // Using Stack

    // public boolean isPalindrome(ListNode head) {

    //     Stack<Integer> s = new Stack<>();
    //     ListNode temp = head;

    //     while(temp != null){
    //         s.push(temp.val);
    //         temp = temp.next;
    //     }

    //     temp = head;

    //     while(temp != null){
    //         if(temp.val != s.pop()){
    //             return false;
    //         }
    //         temp = temp.next;
    //     }

    //     return true;  
    // }

    // Using slow fast pointer

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);
        ListNode copySecondHalf = secondHalf;
        ListNode firstHalf = head;

        while(secondHalf != null) {
            if(firstHalf.val != secondHalf.val){
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverse(copySecondHalf);

        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
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

    public static void main(String[] args){
        int[] arr = {1,2,2,1};

        ListNode head = arrayToList(arr);
        palindromeLL obj = new palindromeLL();

        System.out.println(obj.isPalindrome(head));
    }
}