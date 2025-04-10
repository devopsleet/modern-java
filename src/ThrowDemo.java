import java.nio.channels.FileLockInterruptionException;

class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Cauught Inside demoproc");
            //throw e;
        }
    }

    static void throwOne() throws IllegalAccessException{

            System.out.println("Inside ThrowOne");
            throw new IllegalAccessException("demo");
    }


    public static void main(String[] args) {
        try{
            demoproc();
            throwOne();
        } catch (NullPointerException e) {
            System.out.println("Recaught :" + e.getMessage());
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}
