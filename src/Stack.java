// Improved stack class that uses the length array member

class TestStack2 {
    // instance variables
    private int[] stck;
    private int tos;

    // Constructor Initialization
    TestStack2(int size) {
        stck = new int[size];
        this.tos = -1;
    }

    void push(int element) {
        if (tos == stck.length-1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = element;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}

class Stack {
    public static void main(String[] args) {

        TestStack2 mystack1 = new TestStack2(10);
        TestStack2 mystack2 = new TestStack2(5);

        for(int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        for(int j = 0; j < 5; j++) {
            mystack2.push(j);
        }

        System.out.println("Stack in mystack2");
        for(int i = 0; i < 5; i++) {
            System.out.println(mystack2.pop());
        }

    }
}
