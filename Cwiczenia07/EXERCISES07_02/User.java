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

    //methods:
    // createAuction(title, startingPrice, description, periodInNrOfBiddings, minimalStarsToBid)

    // recieveStar()

    // grantStar(Auction)
    //     czy zakonczona?
    //     czy jestes sprzedawca?
    //     komu przyznac? --> buyer



}
