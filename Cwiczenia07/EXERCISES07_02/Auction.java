public class Auction {

    // id must be unique
    private int id;
    private String auctionType = "normal";      // typ aukcji - podaje seller
    private int startingPrice = 1;              // cena poczatkowa - podaje seller
    private int rounds;                         // ilosc rund - podaje seller
    private int minimalStars = 0;               // minimalna ilość gwiazdek - podaje seller
    private boolean active = false;
    private User seller;
    private User highestBider;
    private int highestBid;

    // wzorce:
    // FACTORY: 3 rodzaje aukcji, rozniace sie zasadami
    // 1. normal      --> wygrywa highestBider w rundie nr '0'
    // 2. prelongated --> wygrywa highestBider w rundie nr '0', kazdy bid wydluza aukcje o 1 runde, koniec gdy pojawi sie runda bez bidow
    // 3. reversed    --> kazdy bid obniza cene o '1', kazdy bid kosztuje bidera '1', bider widzi cene dopiero po zlozeniu bidu, bider wtedy bierze albo nie bierze, jak nie bierze to nastepna runda

    // Simplest of the factory is introduction of a static method in the base class itself, which creates the required object based on the type
    // Define an interface for creating an object, but let subclasses decide which class to instantiate.
    // Factory Method lets a class defer instantiation to subclasses.


    //methods:

    //iterateRounds()
    //      czas 1 rundy

    //bid(User buyer, int bidAmount)
}
