public class CircularQueue {

    int[] queue;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {

        this.capacity = capacity;
        queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        size--;

        return value;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.enqueue(40);

        q.display();
    }
}
