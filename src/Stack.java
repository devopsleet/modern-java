class Stack {
    int stck[] = new int[10];
    int tos;

    // Initilaize
    Stack() {
        tos = -1;
    }

    // push an item
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    // Pop an item

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }

}

class TestStack {
    public static void main(String[] args) {

        Stack mystack = new Stack();


    }
}
