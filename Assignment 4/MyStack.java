import java.util.*;

class SpecialStack {
    Stack<Integer> s;
    Integer minEle;

    SpecialStack() {
        s = new Stack<Integer>();
    }

    void getMin() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Minimum Element in the stack is: " + minEle);
        }
    }

    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Integer t = s.peek();

        System.out.println("Top most Element is: ");
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        } else {
            System.out.println(t);
        }
    }

    void push(Integer x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }
}

class MyStack {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(8);
        s.push(9);
        s.push(2);
        s.getMin();
        s.push(4);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
