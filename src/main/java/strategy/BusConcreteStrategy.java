package strategy;

import java.time.LocalDateTime;

public class BusConcreteStrategy implements IEstrategyPrinter{

    @Override
    public String printTicket() {
        return "Text for Printer ticket Bus customized";
    }
}
