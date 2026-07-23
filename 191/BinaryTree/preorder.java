import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class preorder {
    
    private void preorderConstruct(TreeNode root, List<Integer> list){
        if(root == null) return;

        list.add(root.val);
        preorderConstruct(root.left, list);
        preorderConstruct(root.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        preorderConstruct(root, list);

        return list;
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);

        queue.offer(root);
        int index = 1;

        while(queue != null && index < n){
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
        preorder obj = new preorder();

        TreeNode root = obj.arrayToTree(arr);

        List<Integer> result = obj.preorderTraversal(root);
        System.out.println(result);
    }
}
