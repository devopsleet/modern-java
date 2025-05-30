interface IntStack {
    void push(int item);
    int pop();
}

class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class IFTest {
    public static void main(String[] args) {
        IntStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for(int i = 0; i < 5; i++) {
            mystack1.push(i);
            System.out.println(i);
        }

        for(int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
    }
}
