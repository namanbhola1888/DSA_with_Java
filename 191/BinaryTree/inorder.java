import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class inorder {

    private void inorderPrint(TreeNode root, List<Integer> list){
        if(root == null) return;

        inorderPrint(root.left, list);
        list.add(root.val);
        inorderPrint(root.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorderPrint(root, list);
        
        return list;
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;

        while(!queue.isEmpty() && index < n){
            TreeNode curr = queue.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                queue.offer(leftNode);
            }
            index++;

            if(index < n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                queue.offer(rightNode);
            }
            index++;
        }

        return root;
    }   

    public static void main(String[] args) {
        Integer[] arr = {1,null,2,3};
        inorder obj = new inorder();

        TreeNode root = obj.arrayToTree(arr);

        List<Integer> result = obj.inorderTraversal(root);
        System.out.println(result);
    }
}
