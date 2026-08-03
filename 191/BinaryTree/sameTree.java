import java.util.LinkedList;
import java.util.Queue;

public class sameTree{

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;        

        return isSameTree(p.left, q.left)
         && isSameTree(p.right, q.right);
    }

    private TreeNode arryToTree(Integer[] arr){
        int n = arr.length;
        if(n==0 || arr[0]==null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList();
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

            if(index < n && arr[index]!=null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.add(rightNode);
            }
            index++;
        }

        return root;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {1,2,3};

        sameTree obj = new sameTree();
    
        TreeNode p = obj.arryToTree(arr1);
        TreeNode q = obj.arryToTree(arr2);

        System.out.println(obj.isSameTree(p, q));
    }
}