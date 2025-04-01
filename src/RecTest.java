class Recursion {
    int values[];

    Recursion(int i){
        values = new int[i];
    }

    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }


}

public class RecTest {
    public static void main(String[] args) {
        Recursion r = new Recursion(10);

        for(int x = 0; x < 10; x++) r.values[x] = x;

        r.printArray(10);
    }


}
