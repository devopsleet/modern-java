enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Value of ap " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel");

        String result = switch(ap) {
            case Jonathan -> { yield "Jonathan is red" ;}
            case GoldenDel -> { yield "Golden Del is yellow";}

            default -> { yield "default";}


        };

        System.out.println(result);
    }
}
