import java.util.LinkedList;
import java.util.Queue;

public class MyStack{
    Queue<Integer> q;

    public MyStack(){
        q = new LinkedList<>();
    }

    public void push(int x){
        q.offer(x);   

        for(int i=0; i<q.size()-1; i++){
            q.offer(q.poll());
        }
    }

    public int pop(){
        return q.poll();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.isEmpty();
    }

    public static void main(String[] args){
        MyStack obj = new MyStack();

        obj.push(1);
        obj.push(2);

        System.out.println(obj.top());
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}