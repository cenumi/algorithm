package 二叉树;


public class 判断一棵树是否是平衡二叉树 {
    /**
     * 严格的概念：
     * 对于树中任意一个节点，左子树和右子树高度差不超过1
     *
     */

    public static void main(String[] args) {

    }

    static class Data{
        boolean isBalanced;
        int height;

        public Data(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }


    public static Data isAvt(TreeNode head){
        if (head == null){
            return new Data(true,0);
        }

        Data left = isAvt(head.left);
        if (!left.isBalanced){
            return new Data(false,0);
        }
        Data right = isAvt(head.right);
        if (!right.isBalanced){
            return new Data(false,0);
        }
        if (Math.abs(left.height - right.height) > 1){
            return new Data(false,0);
        }

        return new Data(true,Math.max(left.height,right.height)+1);
    }
}
