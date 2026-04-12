public class sum_to_leaf {

    private static int dfs(TreeNode current_node, int number){
        if(current_node == null) return 0;

        number = number * 10 + current_node.val;

        if (current_node.left == null && current_node.right == null) return number;

        return dfs(current_node.left,number ) + dfs(current_node.right, number); 
    }

    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;

        return dfs(root, 0);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        sum_to_leaf obj = new sum_to_leaf();
        System.out.println(obj.sumNumbers(root));
    }
}
