class ListNode{
    int val;
    ListNode next;
    ListNode (){}
    ListNode (int val) {this.val = val;}
    ListNode (int val, ListNode next) {this.val = val; this.next = next;}
}

public class criticalPoints {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode temp = head;
        ListNode curr = head.next;

        int index = 1;       // current index
        int first = -1;      // first critical point
        int prev = -1;     // prev critical point 
        int minDistance = Integer.MAX_VALUE;

        while(curr.next != null){
            if((curr.val > curr.next.val && curr.val > temp.val) || (curr.val < curr.next.val && curr.val < temp.val)){
                if(first == -1){
                    first = index;
                }
                else{
                    minDistance = Math.min(index - prev, minDistance);
                }

                prev = index;
            }

            temp = temp.next;
            curr = curr.next;
            index++;
        }
        
        if (first == -1 || first == prev) {
            return new int[]{-1, -1};
        }
        
        int maxDistance = prev - first;

        return new int[]{minDistance, maxDistance};
    }

    public ListNode arrayToList(int[] arr){
        int n = arr.length;
        if(n == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i=1; i<n; i++){
            ListNode curr = new ListNode(arr[i]);
            temp.next = curr;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,2,5,1,2};

        criticalPoints obj = new criticalPoints();
        ListNode head = obj.arrayToList(arr);

        int[] result = obj.nodesBetweenCriticalPoints(head);
        System.out.println(result[0] + " and " + result[1]);

        // while(head.next != null){
        //     System.out.print(head.val + " -> ");
        //     head = head.next;
        // }
        // System.out.print(head.val);
    }   
}
