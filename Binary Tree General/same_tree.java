import java.util.Queue;
import java.util.LinkedList;

public class same_tree {

    public boolean isSameTree_BFS(TreeNode p, TreeNode q){

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()){

            TreeNode c1 = q1.poll();
            TreeNode c2 = q2.poll();

            if(c1 == null && c2 ==null){
                continue;
            }

            if(c1 == null || c2 == null){
                return false;
            }

            if(c1.val != c2.val){
                return false;
            }

            q1.add(c1.left);
            q1.add(c1.right);

            q2.add(c2.left);
            q2.add(c2.right);
        }

        return q1.isEmpty() && q2.isEmpty();
    } 

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }


        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        same_tree obj = new same_tree();
        boolean result1 = obj.isSameTree(p, q);
        boolean result2 = obj.isSameTree_BFS(p, q);

        System.out.println(result1);
        System.out.println(result2);

    }
}
