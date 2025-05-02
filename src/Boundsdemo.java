class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for(T num: nums) {
            sum = sum + num.doubleValue();
        }
        return sum/nums.length;
    }

//    boolean sameAvge(Stats<?> ob) {
//
//    }
}

public class Boundsdemo {
    public static void main(String[] args) {

        Integer inums[] = {1,2,3,4,5};

        Stats<Integer> iob = new Stats<Integer>(inums);

        double v = iob.average();
        System.out.println("Double average is " + v);

//        System.out.println("Educa");
//        System.out.println("Docker");


    }
}
