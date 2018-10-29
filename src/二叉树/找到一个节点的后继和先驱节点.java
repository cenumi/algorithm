package 二叉树;

public class 找到一个节点的后继和先驱节点 {
    static class Node{
        int value;
        Node left;
        Node right;
        Node parent;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 该结构比普通二叉树节点结构多了一个指向父节点的 parent 指针。
     * 假设有一颗 Node 类型的节点组成过得二叉树，树中每个节点的 parent指针
     * 都正确地指向自己的父节点，头结点的 parent 指向 null。只给一个在二叉树中的某个节点 node
     * 请事先返回 node 的后继节点的函数。
     * 在二叉树的中序遍历序列中，node的下一个节点叫做 node 的后继节点。
     */

    public static void main(String[] args) {


    }

    public static Node findSuccessor(Node node){
        if (node == null)
            return node;

         if (node.right != null){
             node = node.right;
             while (node.left != null){
                 node = node.left;
             }
             return node;
         }else{
             Node parent = node.parent;
             while (parent != null && parent.left != node){
                 node = parent;
                 parent = node.parent;
             }
             return parent;
         }
    }

    public static Node findPioneer(Node node){
        if (node == null)
            return node;
        if (node.left != null){
            node = node.left;
            while (node.right != null){
                node = node.right;
            }
            return node;
        }else{
            Node parent = node.parent;
            if (parent != null && parent.right != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }
}
