package ComputerFactory;

public class PersonalComputer extends Product{

    private ComputerCase computercase;
    private Monitor monitor;

    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computercase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputercase() {
        return computercase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
