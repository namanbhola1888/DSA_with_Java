import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class postorder {

    private void postorderConstruct(TreeNode root, List<Integer> list){
        if(root == null) return;

        postorderConstruct(root.left, list);
        postorderConstruct(root.right, list);
        list.add(root.val);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        postorderConstruct(root, list);

        return list;
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;

        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(arr[0]);
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

    public static void main(String[] args){
        Integer[] arr = {1, null, 2, 3};

        postorder obj = new postorder();
        TreeNode root = obj.arrayToTree(arr);

        List<Integer> list = obj.postorderTraversal(root);
        System.out.println(list);
    }    
}
