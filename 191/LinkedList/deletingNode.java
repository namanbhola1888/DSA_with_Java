public class deletingNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public static void main(String[] args) {
        int[] arr = {4,5,1,9};

        ListNode head = LinkedListUtils.arrayToList(arr);
        
        deletingNode obj = new deletingNode();
        obj.deleteNode(head);
    }
}
