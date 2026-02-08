import java.util.*;

public class traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int level_size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < level_size; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            result.add(level);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);

        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);

        traversal obj = new traversal();
        List<List<Integer>> list = obj.levelOrder(p);

        for (List<Integer> level : list) {
            System.out.print(level + " ");
        } 
    }
}
