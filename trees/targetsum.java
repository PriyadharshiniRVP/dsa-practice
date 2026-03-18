package trees;

import java.util.HashMap;

public class targetsum {
     static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

   public static int dfs(TreeNode root,long cursum, int target,HashMap<Long, Integer> map){
    if (root ==null){ return 0; }
    cursum+=root.val;
    int count=map.getOrDefault(cursum-target, 0);
    map.put(cursum,map.getOrDefault(cursum, 0)+1);
    count +=dfs(root.left, cursum, target, map);
    count +=dfs(root.right, cursum, target, map);


    map.put(cursum, map.get(cursum) - 1);
   return count;


   }
    public static void main(String[] args) {
    TreeNode root=new TreeNode(1);
    root.left =new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.right.right=new TreeNode(5);
    HashMap<Long, Integer> map=new HashMap<>();
    map.put(0L,1);
    System.out.println("The result is:"+dfs(root, 0, 4, map));
}
}

