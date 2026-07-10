public class ArrayQueue {

    private int[] arr = new int[10];
    private int front = 0;
    private int rear = -1;
    private int size = 0;


    public ArrayQueue() {
    }

    public void push(int x) {
       arr[++rear] = x;
       size++;
    }

    public int pop() {
        int val = arr[front++];
        size--;
        return val;
    }

    public int peek() {
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        ArrayQueue obj = new ArrayQueue();

        obj.push(1);
        obj.push(2);

        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());
    }
}
