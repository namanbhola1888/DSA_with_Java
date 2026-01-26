import java.util.LinkedList;
import java.util.Queue;

public class symmetric {

    public boolean isSymmetric_iterative(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            TreeNode a = q.poll();
            TreeNode b = q.poll();
            
            if (a == null && b == null) continue;
            if(a == null || b == null) return false;
            if(a.val != b.val) return false; 

            q.add(a.left);
            q.add(b.right);

            q.add(a.right);
            q.add(b.left);
        }

        return q.isEmpty();
    }

    private boolean ismirror(TreeNode left, TreeNode right){

        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return ismirror(left.left, right.right) &&
           ismirror(left.right, right.left);

    }
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        return ismirror(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);

        p.left.right = new TreeNode(3);
        p.right.right = new TreeNode(3);

        // p.left = new TreeNode(2);
        // p.right = new TreeNode(2);

        // p.left.left = new TreeNode(3);
        // p.left.right = new TreeNode(3);

        // p.right = new TreeNode(2);
        // p.right.left = new TreeNode(4);
        // p.right.right = new TreeNode(3);

        symmetric obj = new symmetric();
        System.out.println(obj.isSymmetric(p));
        System.out.println(obj.isSymmetric_iterative(p));
    }
}
