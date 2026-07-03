public class intersectionLL{

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            if(temp1 == null){
                temp1 = headB;
            }
            else{
                temp1 = temp1.next;
            }

            if(temp2 == null){
                temp2 = headA;
            }
            else{
                temp2 = temp2.next;
            }
        }

        return temp1;
    }

    public static void main(String[] args){

        
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(1);
        list1.next.next = common;

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(1);
        list2.next.next.next = common;

        intersectionLL obj = new intersectionLL();
        ListNode result = obj.getIntersectionNode(list1, list2);
        System.out.println(result.val);

    }
}