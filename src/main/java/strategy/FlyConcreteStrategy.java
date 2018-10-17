package strategy;

public class FlyConcreteStrategy implements IEstrategyPrinter{

    @Override
    public String printTicket() {
        return "Text for Printer ticket Fly customized";
    }
}
