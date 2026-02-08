import java.util.*;

public class right_side {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int level_size = q.size();

            for (int i = 0; i < level_size; i++) {
                TreeNode curr = q.poll();
                if (i == level_size - 1) {
                    list.add(curr.val);
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        p.left.right = new TreeNode(5);
        p.right.right = new TreeNode(4);

        right_side obj = new right_side();
        List<Integer> list = obj.rightSideView(p);

        for(int x: list){
            System.out.print(x + " ");
        }
    }
}
