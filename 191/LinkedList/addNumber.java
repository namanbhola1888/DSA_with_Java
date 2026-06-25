public class addNumber{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode newlist = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;
        int x, y, sum, digit;

        while(temp1 != null || temp2 != null){
            x = (temp1 != null) ? temp1.val : 0;
            y = (temp2 != null) ? temp2.val : 0;

            sum = x + y + carry;
            carry = sum / 10;
            digit = sum % 10;

            newlist.next = new ListNode(digit);
            newlist = newlist.next;

            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }

        if(carry > 0){
            newlist.next = new ListNode(carry);
        }

        return dummy.next;
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

    public static void main(String[] args) {
        int[] arr1 = {2,4,3};
        int[] arr2 = {5,6,4};

        ListNode list1 = arrayToList(arr1);
        ListNode list2 = arrayToList(arr2);

        addNumber obj = new addNumber();

        ListNode result = obj.addTwoNumbers(list1, list2);

        ListNode temp = result;

        while(temp.next != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
}