class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class copyRandom {

    public Node copyRandomList(Node head) {

        Node temp = head;
        Node dummy = new Node(-1);
        Node newlist = dummy;

        while(temp != null){

            Node newnode =  new Node(temp.val);
            newnode.next = newlist.next;
            newnode.random = newlist.random;
            newlist = newlist.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static Node buildRandomList(Integer[][] arr) {
        if (arr == null || arr.length == 0) return null;

        int n = arr.length;

        // Step 1: create nodes
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(arr[i][0]);
        }

        // Step 2: connect next pointers
        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        // Step 3: connect random pointers
        for (int i = 0; i < n; i++) {
            Integer randIndex = arr[i][1];
            if (randIndex != null) {
                nodes[i].random = nodes[randIndex];
            }
        }

        return nodes[0]; // head
    }


    public static void main(String[] args) {

        Integer[][] input = {
            {3, null},
            {3, 0},
            {3, null}
        };

        Node head = buildRandomList(input);
    
        Node temp = head;
        while (temp != null) {
            System.out.print("Val: " + temp.val + ", Random: ");
            System.out.println(temp.random != null ? temp.random.val : "null");
            temp = temp.next;
        }

        System.out.println();

        copyRandom obj = new copyRandom();
        Node temp1 = obj.copyRandomList(head);

        while (temp1 != null) {
            System.out.print("Val: " + temp1.val + ", Random: ");
            System.out.println(temp1.random != null ? temp1.random.val : "null");
            temp1 = temp1.next;
        }
        
    }
}
