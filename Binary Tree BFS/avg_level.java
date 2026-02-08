import java.util.*;

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


public class avg_level {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level_size;

        while(!q.isEmpty()){
            level_size = q.size();
            double level_sum = 0.0;

            for(int i=0; i<level_size; i++){
                TreeNode curr = q.poll();
                level_sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            list.add(level_sum / level_size);
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);

        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);

        avg_level obj = new avg_level();
        List<Double> list = obj.averageOfLevels(p);

        for(double x : list){
            System.out.printf("%.5f ", x);
        }
    }
}
