public class DigitList {
    private Node head;
    private int size;

    // Constructor
    public DigitList() {
        this.head = null;
        this.size = 0;
    }

    // getters
    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    /** functionalities */
    // add new node to list
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
            //throw new IndexOutOfBoundsException("Index out of bounds");
            return 0;//Changed it so returns 0 if out of bounds

        }

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getDigit();
    }

    // print every node's value in list
    public void printList() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.getDigit() + " ");
            current = current.getNext();
        }
    }

    // return a String of the list
    public String toString() {
        Node current = this.head;
        StringBuilder s = new StringBuilder();
        while (current != null) {
            s.append(current.getDigit());
            current = current.getNext();
        }
        return new StringBuilder(s.toString()).reverse().toString();
    }

    // make a linked list of ints out of a given string
    public static DigitList makeList(String bigNumber) {

        DigitList newList = new DigitList();

        for (int i = bigNumber.length() - 1; i >= 0; i--) { // add digits to list in reverse

            int newDigit = Character.getNumericValue(bigNumber.charAt(i));
            newList.add(newDigit);
        }

        return newList;
    }

    public void deleteAllNodes() {
        head = null; // Set the head to null to remove the entire list
    }

}
