package com.company.q4;

public class Run_Q4 {
    public static void main(String[] args) {
        BinNode<String> leaf1 = new BinNode<String>("blue");
        BinNode<String> leaf2 = new BinNode<String>("blue");
        BinNode<String> leaf3 = new BinNode<String>("blue");
        BinNode<String> leaf4 = new BinNode<String>("blue");

        BinNode<String> root = new BinNode<String>(
                new BinNode<String>(leaf1, "white", leaf2),
                "blue",
                new BinNode<String>(leaf3, "white", leaf4));
        System.out.println(independenceTree(root));
        System.out.println(isIndenpendence74(root));
    }

    public static boolean isIndenpendence74(BinNode<String> t) {
        if (independenceTree(t))
            return true;
        int treeSize = countTree(t);
        if (treeSize >= 4 && treeSize <= 7)
            return true;

        return false;
    }

    /**
     * q4.a
     *
     * @param tr
     * @return
     */
    public static boolean independenceTree(BinNode<String> tr) {
        if (tr == null)
            return true;
        if (isLeaf(tr))
            return tr.getValue().equals("blue");
        if (tr.getValue().equals("blue")) {
            if (!tr.hasLeft() || !tr.hasRight())
                return false;
            if (!tr.getLeft().getValue().equals("white") ||
                    !tr.getRight().getValue().equals("white"))
                return false;
        }
        return independenceTree(tr.getLeft()) && independenceTree(tr.getRight());
    }

    /**
     * custom method
     *
     * @param tr
     * @return number of nodes in given tree
     */
    public static int countTree(BinNode<String> tr) {
        if (tr == null)
            return 0;
        return countTree(tr.getLeft()) + countTree(tr.getRight()) + 1;
    }

    /**
     * custom method
     *
     * @param tr
     * @return true if given node is leaf
     */
    public static boolean isLeaf(BinNode<String> tr) {
        if (tr.getLeft() == null && tr.getRight() == null && tr != null)
            return true;
        return false;
    }
}
