class Example2 {
    public static void main(String[] args) {

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);

        myFloatValue = 5f;
        myDoubleValue = 5d;

        // By default, real numbers are double type
        float myOtherFloatValue = (float) 5.25;
        System.out.println(myOtherFloatValue);

    }
}
