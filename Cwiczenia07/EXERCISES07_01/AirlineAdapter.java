/*
Autor: Artur Dembicki 16323
Cw 7, Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
*/
import java.util.Date;
import java.util.List;

public class AirlineAdapter implements BATicketService,UATicketService {

    private UATicketService United;
    private BATicketService British;
    private AirlineAdapter(UATicketService United,BATicketService British){
        this.British=British;
        this.United=United;
    }

    public List<BATicket> getTicketInfo(Airport from, Airport to, Date when) {
        return null;
    }

    public List<UATicketInfo> getTicketInfo(String from, String to, Date when) {
        return null;
    }
}
