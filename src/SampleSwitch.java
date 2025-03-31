public class SampleSwitch {
    public static void main(String[] args) {
        for(int i = 0; i <=3; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                default:
                    System.out.println("You have reached to the default statement");
            }
        }
    }
}
