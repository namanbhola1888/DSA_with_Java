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

public class arrayToBst{

    private TreeNode convert(int[] nums, int left, int right){
        if(left > right) return null;

        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = convert(nums, left, mid-1);
        node.right = convert(nums, mid+1, right);

        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }


    static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};

        arrayToBst obj = new arrayToBst();
        TreeNode node = obj.sortedArrayToBST(nums);
        
        inorder(node);
    }
}