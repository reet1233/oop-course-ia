package q2_8;

public class OOPLinkedList {
    private OOPLinkedListElement head;

    public OOPLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        OOPLinkedListElement newElement = new OOPLinkedListElement(data);
        newElement.setNext(head);
        head = newElement;
    }

    public void removeHead() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public OOPLinkedListElement getElement() {
        return head;
    }

    public OOPLinkedListElement getElement(int index) {
        if (index < 0) {
            return null;
        }
        OOPLinkedListElement current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return null;
            }
            current = current.getNext();
        }
        return current;
    }

    public int getSize() {
        int size = 0;
        OOPLinkedListElement current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}