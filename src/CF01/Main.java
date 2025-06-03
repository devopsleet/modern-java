package CF01;

//import CF01.PersonalComputer;

public class Main {

    public static void main(String[] args) {

        ComputerCase theNewCase = new ComputerCase("2208", "Dell", "240");
        Monitor theNewMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theNewMotherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");
        PersonalComputer theNewPc = new PersonalComputer("2208", "Dell", theNewCase, theNewMonitor, theNewMotherboard);

        theNewPc.getMonitor().drawPixelAt(10,10,"red");
        theNewPc.getMotherboard().loadProgram("Windows OS");
        theNewPc.getComputerCase().pressPowerButton();
    }
}
