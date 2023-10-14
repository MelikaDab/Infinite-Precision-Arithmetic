public class DigitList {
    private Node head;
    private int size;

    // Constructor
    public DigitList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int digit) {
        Node newNode = new Node(digit);
        if (head == null) { // if list is empty
            head = newNode;
        }
        else { // list not empty
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    // get value of a node at given index
    public int get(int index) {
        Node current = head;

        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getDigit();
    }

    public void printList() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.getDigit() + " ");
            current = current.getNext();
        }
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    // make a linked list of ints out of a given string
    public static DigitList makeList(String bigNumber) {

        DigitList newList = new DigitList();

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            // better way of casting?? using (int) on char returns ascii value of char
            int newDigit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            newList.add(newDigit);
        }

        return newList;
    }

}
