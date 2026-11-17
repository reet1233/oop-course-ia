package q2_9;

public class SearchSet {
    private int numElements;
    private BinaryTreeNode head;

    public SearchSet() {
        this.numElements = 0;
        this.head = null;
    }

    public void insert(int value) {
        if (head == null) {
            head = new BinaryTreeNode(value);
            numElements++;
            return;
        }
        BinaryTreeNode current = head;
        while (true) {
            if (value == current.getValue()) {
                return;
            } else if (value < current.getValue()) {
                if (current.getLeft() == null) {
                    current.setLeft(new BinaryTreeNode(value));
                    numElements++;
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(new BinaryTreeNode(value));
                    numElements++;
                    return;
                }
                current = current.getRight();
            }
        }
    }

    public int getNumElements() {
        return numElements;
    }

    public boolean contains(int value) {
        BinaryTreeNode current = head;
        while (current != null) {
            if (value == current.getValue()) {
                return true;
            } else if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchSet set = new SearchSet();
        System.out.println("Initial size: " + set.getNumElements()); // 0
        System.out.println("Contains 5: " + set.contains(5));         // false

        set.insert(5);
        set.insert(2);
        set.insert(8);
        set.insert(5); // Duplicate ignored
        set.insert(1);

        System.out.println("Size after inserts: " + set.getNumElements()); // 4
        System.out.println("Contains 2: " + set.contains(2));              // true
        System.out.println("Contains 8: " + set.contains(8));              // true
        System.out.println("Contains 7: " + set.contains(7));              // false
    }
}