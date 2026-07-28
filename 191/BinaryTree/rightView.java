import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            int level_size = queue.size();

            for(int i=0; i<level_size; i++){
                if(i == level_size-1){
                    list.add(curr.val);
                }

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
        }

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
    
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,null,null,null,5};

        rightView obj = new rightView();

        TreeNode root = obj.arrayToTree(arr);
        List<Integer> list = obj.rightSideView(root);

        System.out.println(list);
    }
}
