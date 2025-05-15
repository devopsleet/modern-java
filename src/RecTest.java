class Rec {
    int values[];

    Rec(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if ( i == 1) return;
        else printArray(i-1);
        System.out.println(values[i-1]);
    }
}

class RecTest {
    public static void main(String[] args) {

        Rec r = new Rec(10);
        System.out.println(r.values.length);
        for(int i=0; i < r.values.length; i++) {
            r.values[i] = i;
        }

        r.printArray(10);

    }
}
