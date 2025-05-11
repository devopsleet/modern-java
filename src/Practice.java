

public class Practice {

    public static void main(String[] args) {
        int myMaxIntTest = 2_147_18;
        System.out.println(myMaxIntTest);

        System.out.println("Byte Value range is from " + Byte.MIN_VALUE  + " to " + Byte.MAX_VALUE);
        System.out.println("Byte Value range is from " + Short.MIN_VALUE  + " to " + Short.MAX_VALUE);
        System.out.println(Integer.SIZE);

        long myLongValue = 100L;
        System.out.println(myLongValue);

        System.out.println("A long has a width of " + Long.SIZE);
        System.out.println(Long.MAX_VALUE);

        long myLongVal = (long) Integer.MAX_VALUE + 2;
        System.out.println(myLongVal);

        short myMinShortValue = Short.MIN_VALUE; int myIntVal = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        //byte myMinByteValue = Byte.MIN_VALUE;

        //byte myTotal = (myMinByteValue / 2);
        //System.out.println(myTotal);

        byte a = Byte.MAX_VALUE;

        short s = Short.MAX_VALUE;

        int i = Integer.MAX_VALUE;

        long l = (50000L + 10L * ((long)a + s + i));
        System.out.println(l);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        float myFloatValue = 5;
        System.out.println(myFloatValue);

        float myOtherFloatValue = (float) 5.25;
        System.out.println(myOtherFloatValue);

        int myIntValue = 5;
       // float myFloatValue = 5f;
        double myDoubleValue = 5d;

        myFloatValue  = 5.0f /2;
        System.out.println(myFloatValue);

        float pounds = 200f;
        float kilos = pounds * .45359237f;
        System.out.println(kilos);

        char myChar = 'D';
        System.out.println(myChar);




    }
    //int myMaxIntTest = 2_147_18;



}
