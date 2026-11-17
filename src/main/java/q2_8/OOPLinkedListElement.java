package q2_8;

public class OOPLinkedListElement {
    private int data;
    private OOPLinkedListElement next;

    public OOPLinkedListElement(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public OOPLinkedListElement getNext() {
        return next;
    }

    public void setNext(OOPLinkedListElement next) {
        this.next = next;
    }
}
