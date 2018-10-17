package strategy;

public class TravelAgencyContext {
    private  IEstrategyPrinter _estrategyPrinter;
    private int code_ticket;


    public int getCode_ticket() {
        return code_ticket;
    }

    public void setCode_ticket(int code_ticket) {
        this.code_ticket = code_ticket;
    }

    public TravelAgencyContext(IEstrategyPrinter _estrategyPrinter) {
        this._estrategyPrinter = _estrategyPrinter;
    }
    public String printTicketTravel() {
        return _estrategyPrinter.printTicket();
    }
    public void set_estrategyPrinter(IEstrategyPrinter _estrategyPrinter) {
        this._estrategyPrinter = _estrategyPrinter;
    }
}
