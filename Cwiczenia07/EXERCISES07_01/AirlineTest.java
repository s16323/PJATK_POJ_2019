/*
Autor: Artur Dembicki 16323
Cw 7, Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
*/
import java.time.LocalDateTime;

public class AirlineTest {

    public static void main(String[] args){
        UATicketInfo testUnited = new UATicketInfo();
        BATicket testBritish = new BATicket();
        Airport gdansk = new Airport();
        Airport warszawa = new Airport();
        Airport berlin = new Airport();

        LocalDateTime departure = LocalDateTime.of(2004,12,3,14,54,3);
        LocalDateTime arrival = departure.plusHours(2);

        gdansk.airportCode="GDA";
        warszawa.airportCode="WAR";
        berlin.airportCode="BER";

        testUnited.from = "Gdańsk";
        testUnited.to = "Warszawa";
        testUnited.dateTime = departure;
        testUnited.price = 25.0d;

        testBritish.departureTime = departure;
        testBritish.ticketPrice = 234.0d;

        System.out.println(testUnited.from);
        System.out.println(testUnited.to);
        System.out.println(testUnited.dateTime);
        System.out.println(testUnited.price);
        System.out.println();
        System.out.println(gdansk.airportCode);
        System.out.println(berlin.airportCode);
        System.out.println(warszawa.airportCode);
        System.out.println();
        System.out.println(testBritish.ticketPrice);
        System.out.println(testBritish.departureTime);

        int flightLenght = arrival.getHour()-departure.getHour();

        System.out.println(flightLenght+" Hours");
    }
}
