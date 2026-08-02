import java.util.LinkedList;
import java.util.Queue;

public class maxWidth {
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        if(root == null) return maxWidth;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level_size = q.size();

            for(int i=0; i<level_size; i++){
                TreeNode curr = q.poll();

                if(curr.left != null) q.offer(curr.left); 
                if(curr.right != null) q.offer(curr.right); 

                // if(i==0 && curr.left != null)
                
            }
        }

        return maxWidth;
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
        Integer[] nums = {1,3,2,5,3,null,9};

        maxWidth obj = new maxWidth();
        TreeNode root = obj.arrayToTree(nums);

        System.out.println(obj.widthOfBinaryTree(root));
    }
}
