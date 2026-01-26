import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class max_depth {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        int depth = 0;
        int size=0;
        q.add(root);
        
        while(!q.isEmpty()){
            size = q.size();

            for(int i=0; i<size; i++){
                TreeNode c = q.remove();
                if (c.left != null) q.add(c.left);
                if (c.right != null) q.add(c.right);
            }
            depth++;
        }
        return depth;
    }
    
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        max_depth obj = new max_depth();
        int result = obj.maxDepth(root);

        System.out.println("Max Depth: " + result);
    }
}

// public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(start);

//         while(!q.isEmpty()){
//             int c = q.remove();
//             if(vis[c] == false){
//                 System.out.print(c + " ");
//                 vis[c] = true;
//                 for(int i=0; i<graph[c].size();i++){
//                     Edge e = graph[c].get(i);
//                     q.add(e.d);
//                 }
//             }
//         }
// }