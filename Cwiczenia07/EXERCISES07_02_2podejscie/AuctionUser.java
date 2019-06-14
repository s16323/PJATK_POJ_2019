/*
    Artur Dembicki 16323
    Cw 7, Zad 2
    http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
     */
public class AuctionUser {
    private char type;
    private String firstName;
    private String lastName;
    private String email;
    int trustPoints;

    public AuctionUser(char type){
        this.type=type;
    }
    public AuctionUser Name(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        return this;
    }
    public AuctionUser eMail(String email){
        this.email=email;
        return this;
    }

    public AuctionUser build(){
        AuctionUser user = new AuctionUser();
        user.email = this.email;
        user.lastName = this.lastName;
        user.firstName=this.firstName;
        user.trustPoints = this.trustPoints;
        user.type = this.type;
        return user;
    }
    private AuctionUser(){}

    public String getName(){
        return firstName+" "+lastName;
    }
}
