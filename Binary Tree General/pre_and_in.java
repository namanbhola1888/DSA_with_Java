import java.util.HashMap;

public class pre_and_in {
    int index=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) { 

        HashMap<Integer, Integer> map = new HashMap<>();
        int inorder_length = inorder.length;

        for(int i=0; i<inorder_length; i++){
            map.put(inorder[i], i);
        }

        // map.forEach((key, value) -> 
        //     System.out.println("Key: " + key + " Value: " + value)
        // );

        return helper(preorder, 0, inorder_length - 1, map);
    }

    private TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map){
        if (start > end) return null;

        int rootValue = preorder[index++];
        TreeNode node = new TreeNode(rootValue);

        int inorderIndex = map.get(rootValue);

        node.left = helper(preorder, start, inorderIndex - 1, map);
        node.right = helper(preorder, inorderIndex + 1, end, map);

        return node;
    }

    public static void printPreorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        pre_and_in obj = new pre_and_in();
        TreeNode root = obj.buildTree(preorder, inorder);

        obj.printPreorder(root);
        
    }    
}
