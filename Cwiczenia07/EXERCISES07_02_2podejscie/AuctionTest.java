/*
    Artur Dembicki 16323
    Cw 7, Zad 2
    http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
     */
     public class AuctionTest {

    public static void main (String[] args){
        AuctionUser user = new AuctionUser('s')
                .Name("testUser", "testUserSurname")
                .eMail("test@gmail.com")
                .build();
        Auction auction = new Auction('p')
                .Description("test description")
                .Duration(5)
                .Name("test auction name")
                .PriceStart(100.0d)
                .addingUser(user)
                .build();
        if(auction.type == 'p'){
            if(auction.auctionDuration == 0){
                auction.auctionWon(user);
            }
        }else if(auction.type == 'w'){
            if(auction.auctionDuration == 0){
                auction.auctionWon(user);
                auction.auctionDuration += 1;
            }
        }else if(auction.type == 'o'){
            if(auction.isAuctioned()){
                auction.startPrice -= 1;
                System.out.println(auction.startPrice);
            }
        }
    }
}
