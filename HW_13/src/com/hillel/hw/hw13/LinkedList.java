package com.hillel.hw.hw13;

public class LinkedList<T> {

    Node node = new Node<>();
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
    }

    public LinkedList(T[] data) {

        for (T temp : data) {
            addLast(temp);
        }

    }

    public void addLast(T value) {

        node.setValue(value);

        if (isEmpty()) {
            first = node;

        } else {
            last.setNext(node);
            last = node;

        }

    }

    public void addFirst(T value) {

        node.setValue(value);

        if (isEmpty()) {
            first = node;
            last = node;

        } else {
            node.setNext(first);
            first = node;
        }
        size++;
    }


    public void add(T value, int index) {
        if (index == size()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size() - 1) {
            add(value);
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> temp = getNode(index);
            Node<T> newNode = new Node<T>(value, temp);
            prevNode.setNext(newNode);
        }

    }

    private void add(T value) {
    }


    public void deleteLast() {
        if (isEmpty())
            return;
        else {
            last = node.getNext();
            size--;
        }

    }

    public void deleteFirst() {
        if (isEmpty())
            return;
        else {
            first = first.getNext();
            size--;
        }

    }

    public void delete(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0)
            deleteFirst();
        else {
            Node<T> before = node(index - 1);
            Node<T> after = node(index + 1);
            before.setNext(after);
            size--;
        }
    }

    private Node<T> node(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        Node<T> result = node;
        for (int i = 0; i < index; i++) {
            result = result.getNext();
        }
        return result;
    }

    public void change(int firstPosition, int secondPosition) {
        if (firstPosition == 0) {
            Node first = getNode(firstPosition);
            Node second = getNode(secondPosition - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        } else if (secondPosition == 0) {
            Node first = getNode(secondPosition);
            Node second = getNode(firstPosition - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        } else {
            Node first = getNode(firstPosition - 1);
            Node second = getNode(secondPosition - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        }

    }

    public int size() {
        Node node = first;
        int size = 0;
        if (isEmpty()) {
            return 0;
        } else {
            while (node != null) {
                size++;
                node = node.getNext();
            }
            return size;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {

        return first == null;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out = out + getNode(i).getValue();
        }
        return out;
    }

    private Node<T> getNode(int index) {
        Node<T> temp = first;
        int count = 0;
        while (count != index) {
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    private static class Node<T> {

        private T value;
        private Node<T> next;

        public Node() {
            this.value = value;
            this.next = next;
        }

        public Node(T value, Node<T> temp) {
            this.value = value;
            this.next = next;
        }


        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

}
