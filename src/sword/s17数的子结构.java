package sword;

public class s17数的子结构 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    /**
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     */

    public static void main(String[] args) {

    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null)
            return false;
        return true;
    }
}
