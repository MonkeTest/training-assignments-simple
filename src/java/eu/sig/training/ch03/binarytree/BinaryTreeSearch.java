package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue)
            return depth;
        else
            return traverseByValue(node, nodeValue);
    }
    private static int traverseByValue(BinaryTreeNode<Integer> node, int nodeValue) {
        BinaryTreeNode<Integer> childNode = getChildNode(node, nodeValue);
        if (childNode == null) {
            throw new TreeException("Value not found in tree!");
        } else
            return 1 + calculateDepth(childNode, nodeValue);
    }
    private static BinaryTreeNode<Integer> getChildNode(BinaryTreeNode<Integer> node, int nodeValue) {
        if (nodeValue < node.getValue()) {
            return node.getLeft();
        } else
            return node.getRight();
    }
}