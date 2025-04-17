class NewThread implements Runnable{
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
    }
    public void run(){
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception encountered");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();

        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception encountered");
        }

    }
}
