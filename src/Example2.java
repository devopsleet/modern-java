class Example2 {
    public static void main(String[] args) {

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int myIntValue = 5; float myFloatValue = 50_000_000.0f; double myDoubleValue = 5d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);

        myFloatValue = 5f;
        myDoubleValue = 5d;

        myIntValue = 5/3;
        System.out.println(myIntValue);

        myFloatValue = 5f/3f;
        System.out.println(myFloatValue);


        myDoubleValue = 5d/3d;
        System.out.println(myDoubleValue);

        myDoubleValue = 5.0/3.0;
        System.out.println(myDoubleValue);

        myFloatValue = (float) (5.0/3.0);
        System.out.println(myFloatValue);





    }
}
