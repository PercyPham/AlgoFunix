package vn.edu.funix.algo.data;

public class BinarySearchTree {
    private int value;
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public BinarySearchTree insert(int value) {
        if (value < this.value) {
            if (this.left == null) this.left = new BinarySearchTree(value);
            else this.left.insert(value);
        } else {
            if (this.right == null) this.right = new BinarySearchTree(value);
            else this.right.insert(value);
        }
        return this;
    }

    public boolean contains(int value) {
        if (this.value == value) return true;

        if (value < this.value) {
            if (this.left == null) return false;
            else return this.left.contains(value);
        } else {
            if (this.right == null) return false;
            else return this.right.contains(value);
        }
    }

    public void remove(int value) {
        // TODO: remove
    }

    public int[] traverseInOrder() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list = traverseInOrder(list);
        return convertToArray(list);
    }

    private DoublyLinkedList<Integer> traverseInOrder(DoublyLinkedList<Integer> list) {
        if (this.left != null) {
            this.left.traverseInOrder(list);
        }
        list.add(this.value);
        if (this.right != null) {
            this.right.traverseInOrder(list);
        }
        return list;
    }

    public int[] traversePreOrder() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list = traversePreOrder(list);
        return convertToArray(list);
    }

    private DoublyLinkedList<Integer> traversePreOrder(DoublyLinkedList<Integer> list) {
        list.add(this.value);
        if (this.left != null) {
            this.left.traversePreOrder(list);
        }
        if (this.right != null) {
            this.right.traversePreOrder(list);
        }
        return list;
    }

    public int[] traversePostOrder() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list = traversePostOrder(list);
        return convertToArray(list);
    }

    private DoublyLinkedList<Integer> traversePostOrder(DoublyLinkedList<Integer> list) {
        if (this.left != null) {
            this.left.traversePostOrder(list);
        }
        if (this.right != null) {
            this.right.traversePostOrder(list);
        }
        list.add(this.value);
        return list;
    }

    private int[] convertToArray(DoublyLinkedList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int getValue() {
        return value;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }
}
