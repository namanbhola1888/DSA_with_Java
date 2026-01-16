
import java.lang.classfile.constantpool.MemberRefEntry;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class merge_list {

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(-1);
        ListNode newlist = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                newlist.next = temp1;
                temp1 = temp1.next;
            }
            else{
                newlist.next = temp2;
                temp2 = temp2.next;
            }

            newlist = newlist.next;
        } 

        if (temp1 != null) newlist.next = temp1;
        if (temp2 != null) newlist.next = temp2;

        return dummy.next;
    }

    public static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};

        ListNode list1 = arrayToList(arr1);
        ListNode list2 = arrayToList(arr2);

        merge_list obj = new merge_list();
        ListNode merged = obj.mergeTwoLists(list1, list2);

        printList(merged);

    }
}
