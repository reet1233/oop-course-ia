package q2_9;

public class FunctionalArray {
    private final int size;
    private final BinaryTreeNode root;

    public FunctionalArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }
        this.size = size;
        this.root = buildTree(size);
    }

    private BinaryTreeNode buildTree(int n) {
        if (n == 0) {
            return null;
        }
        BinaryTreeNode node = new BinaryTreeNode(0);
        int remaining = n - 1;
        // Odd 0-based indices go left, even 0-based indices (> 0) go right
        int leftSize = remaining - (remaining / 2);
        int rightSize = remaining / 2;
        node.setLeft(buildTree(leftSize));
        node.setRight(buildTree(rightSize));
        return node;
    }

    private BinaryTreeNode findNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        BinaryTreeNode current = root;
        while (index > 0) {
            if (index % 2 == 1) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            index = (index - 1) / 2;
        }
        return current;
    }

    public void set(int index, int value) {
        findNode(index).setValue(value);
    }

    public int get(int index) {
        return findNode(index).getValue();
    }
}