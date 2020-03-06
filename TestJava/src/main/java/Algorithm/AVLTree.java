package Algorithm;

public class AVLTree<K extends  Comparable<K>, V> {
    private class Node{

        K key;
        V value;
        Node left, right;

        /**
         * 结点高度值
         */
        int height;

        Node(K key, V value){
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    private Node root;
    private int size;

    public AVLTree(){
        root = null;
        size = 0;
    }

    /**
     * 获得结点的高度
     *
     * @param node
     * @return
     */
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    /**
     * 获得结点node的平衡因子
     *
     * @param node
     * @return
     */
    private int getBalanceFactor(Node node) {
        if (node == null){
            return 0;
        }

        return getHeight(node.left);
    }
}
