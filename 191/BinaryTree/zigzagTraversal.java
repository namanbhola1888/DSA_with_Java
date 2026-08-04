import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level_no = 0;

        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> list = new LinkedList<>(); 
            
            for(int i=0; i<levelsize; i++){
                TreeNode curr = q.poll();

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

                if(level_no % 2 ==0){
                    list.addLast(curr.val);
                }
                else{
                    list.addFirst(curr.val);
                }
            }

            level_no++;
            result.add(list);
        }

        return result;
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.offer(root);

        int index = 1;

        while(!q.isEmpty() && index < n){
            TreeNode curr = q.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                q.add(leftNode);
            }
            index++;

            if(index < n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.add(rightNode);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};

        zigzagTraversal obj = new zigzagTraversal();
        TreeNode root = obj.arrayToTree(arr);
        
        List<List<Integer>> result = obj.zigzagLevelOrder(root);
        System.out.println(result);
    }
}
