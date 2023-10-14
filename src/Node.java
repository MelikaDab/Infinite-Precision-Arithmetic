public class Node {
    private int digit;
    private Node next;

    // Constructor
    public Node(int digit) {
        this.digit = digit;
        this.next = null;
    }

    // getters
    public int getDigit() {
        return digit;
    }

    public Node getNext() {
        return next;
    }

    // setters
    public void setDigit(int digit) {
        this.digit = digit;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
