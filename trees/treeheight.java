package trees;

public class treeheight {

    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val =val;
            this.right=null;
            this.left=null;

        }
}
public static int  height(TreeNode root){
    if (root==null){
        return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);

    return 1+Math.max(leftHeight,rightHeight);
}
public static void main(String[] args) {
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    System.out.println("The height is:" +height(root));
   
}
    
}
