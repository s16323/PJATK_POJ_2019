/*
Autor: Artur Dembicki 16323
Cw 7, Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
*/

public class User {

    //login, email must be unique
    private String name;
    private String surmame;
    private String login;
    private String password;
    private String email;
    private int stars = 0;

    public User(String name, String surmame, String login, String password, String email, int stars) {
        this.name = name;
        this.surmame = surmame;
        this.login = login;
        this.password = password;
        this.email = email;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public String getSurmame() {
        return surmame;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public int getStars() {
        return stars;
    }

    //methods:

    // zmiań sobie login
    private void changeLogin(String newLogin){
        this.login = newLogin;
        //TODO: update login for all ongoing activities
    }
    // zmiań sobie email
    private void changeEmail(String newEmail){
        this.email = newEmail;
        //TODO: update email for all ongoing activities
    }

    public void recieveStar(){
        this.stars = this.stars +1;
        //TODO: Prevent cheating
    }

    // dodaj userowi gwiazdkę
    private void grantStar(Auction auction){
        //     czy zakonczona?
        //     czy jestes sprzedawca?
        //     komu przyznac? --> buyer
        if (!auction.isActive() && auction.getSeller() == this){
            User userToReward = auction.getHighestBidder();
            userToReward.recieveStar();
            //TODO: block any more stars for this auction ID
        }

    }

    // utwórz nową aukcję
    private void createAuction(String auctionType, String description, int startingPrice, int rounds, int minimalStars){
        User seller = this;
        Auction myAuction = new Auction(auctionType, description, startingPrice, rounds, minimalStars, seller);
    }


    // zakończ aukcje przed czasem
    private void setActiveFalse(Auction auction) {
        if (auction.getSeller() == this && auction.isActive()) { //TODO: create seller.verifyIdentity
            auction.setActive(false);
        }
        //else System.out.println("Action forbidden");
        // TODO: do try/catch instead and manage exceptions: badUser
    }

    // licytuj
    private void placeBid(Auction auction, int bidAmount){
        User buyer = this;
        auction.bid(buyer,bidAmount);
    }



}
