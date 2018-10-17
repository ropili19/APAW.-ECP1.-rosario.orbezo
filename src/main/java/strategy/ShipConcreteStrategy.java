package strategy;

public class ShipConcreteStrategy implements IEstrategyPrinter{

    @Override
    public String printTicket() {
        return "Text for Printer ticket Ship customized";
    }
}
