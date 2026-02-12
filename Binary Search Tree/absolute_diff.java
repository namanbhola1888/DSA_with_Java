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

public class absolute_diff {

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }


    public int getMinimumDifference(TreeNode root) {

        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        int list_size = list.size();
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<list_size-1; i++){
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            minDiff = Math.min(diff, minDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(4);
        p.left = new TreeNode(2);
        p.right = new TreeNode(6);

        p.left.left = new TreeNode(1);
        p.left.right = new TreeNode(3);

        absolute_diff obj = new absolute_diff();
        int c = obj.getMinimumDifference(p);

        System.out.println(c);
    }
}
