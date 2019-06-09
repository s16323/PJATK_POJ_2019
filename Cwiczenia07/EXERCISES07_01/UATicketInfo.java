public interface UATicketService{
    List<UATicketInfo> getTicketInfo(String from, String to,Date when);
}

public class UATicketInfo{String from;String to;DateTimedateTime;double price;}
