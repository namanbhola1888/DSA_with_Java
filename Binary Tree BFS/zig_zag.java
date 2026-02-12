import java.util.*;

public class zig_zag{

    static List<Integer> reverse(List<Integer> level) {
        List<Integer> reversed = new ArrayList<>(level);
        Collections.reverse(reversed);
        return reversed;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level_no = 0;

        while(!q.isEmpty()){
            int level_size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<level_size; i++){
                    TreeNode curr = q.poll();
                    level.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if(level_no % 2 == 0){
                list.add(level);
            }
            else{
                list.add(reverse(level));
            }
            
            level_no += 1;
        }

        return list;
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);

        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);

        zig_zag obj = new zig_zag();
        List<List<Integer>> list = obj.zigzagLevelOrder(p);

        for (List<Integer> level : list) {
            System.out.print(level + " ");
        } 
    }
}