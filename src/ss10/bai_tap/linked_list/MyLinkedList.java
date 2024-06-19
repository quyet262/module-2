package ss10.bai_tap.linked_list;

public class MyLinkedList<E> {
    public class Node<E> {
        Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }
    }
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(numNodes, e);
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
        }
        numNodes--;
        return removedNode.data;
    }

    public boolean remove(Object e) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null) {
            if (current.data.equals(e)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                numNodes--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node<E> current = head;
        while (current != null) {
            clone.addLast(current.data);
            current = current.next;
        }
        return clone;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        // LinkedList tự động thay đổi kích thước nên không cần thực hiện phương thức này.
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public E getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return head.data;
    }

    public E getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            result.append(current.data);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
