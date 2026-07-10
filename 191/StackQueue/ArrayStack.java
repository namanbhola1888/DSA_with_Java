public class ArrayStack{
    
    private int[] arr = new int[10];
    private int top = -1;

    public ArrayStack() {
        top = -1;
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
       arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int top() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args){
        ArrayStack obj = new ArrayStack();
        obj.push(1);
        obj.push(2);

        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.isEmpty());
    }
}