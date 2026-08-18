import java.util.Queue;
import java.util.LinkedList;

public class searchTree{

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) return root;
        
        if(val < root.val){
            return searchBST(root.left, val);
        }
        
        return searchBST(root.right, val);
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n==0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        int index = 1;

        while(!q.isEmpty() && index<n){
            TreeNode curr = q.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                q.add(leftNode);
            }
            index++;

            if(index<n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.add(rightNode);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args){
        Integer[] arr = {4,2,7,1,3};

        searchTree obj = new searchTree();
        TreeNode root = obj.arrayToTree(arr);

        TreeNode result = obj.searchBST(root, 2);
        System.out.print(result.val);
    }
}