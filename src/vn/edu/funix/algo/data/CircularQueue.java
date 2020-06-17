package vn.edu.funix.algo.data;

public class CircularQueue {
    private int capacity;
    private int[] queue;
    private int head = -1;
    private int tail = -1;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity + 1];
    }

    public int size() {
        if (tail >= head) {
            return tail - head;
        }
        return (queue.length - head) + tail;
    }

    private boolean isFull() {
        return size() == capacity;
    }

    public boolean enqueue(int data) {
        if (isFull()) return false;

        if (head == -1) {
            head = 0;
            tail = 1;
            queue[head] = data;
            return true;
        }

        queue[tail] = data;
        tail++;
        if (tail == queue.length) tail = 0;

        return true;
    }

    public int dequeue() throws Exception {
        if (size() == 0) throw new Exception("Queue is empty");

        int result = queue[head];
        head++;
        if (head == queue.length) head = 0;
        return result;
    }

    public int peek() throws Exception {
        if (size() == 0) throw new Exception("Queue is empty");
        return queue[head];
    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";

        String s = "[" + queue[head];

        int i = head + 1;
        if (i == queue.length) i = 0;
        while (i != tail) {
            s += "," + queue[i];
            i++;
            if (i == queue.length) i = 0;
        }

        s += "]";
        return s;
    }
}
