/*
Autor: Artur Dembicki 16323
Cw 7, Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_07_2019.06.08.pdf
*/

import java.sql.Time;
import java.util.UUID;
import java.util.Date;
import java.util.Random;
import java.time.Instant;
import java.util.concurrent.TimeUnit;


public class Auction {

    // id must be unique
    private int id = (int) (Math.random() * 1000 + 100);
    private String auctionType = "normal";      // typ aukcji - podaje seller
    private String description = "";
    private int startingPrice = 1;              // cena poczatkowa - podaje seller
    private int rounds;                         // ilosc rund - podaje seller
    private int minimalStars = 0;               // minimalna ilość gwiazdek - podaje seller
    private boolean active;
    private User seller;
    private User highestBidder;
    private int highestBid;

    public Auction(String auctionType, String description, int startingPrice, int rounds, int minimalStars, User seller) {
        this.auctionType = auctionType;
        this.description = description;
        this.startingPrice = startingPrice;
        this.rounds = rounds;
        this.minimalStars = minimalStars;
        this.active = true;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAuctionType() {
        return auctionType;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getMinimalStars() {
        return minimalStars;
    }

    public boolean isActive() {
        return active;
    }

    public User getSeller() {
        return seller;
    }

    public User getHighestBidder() {
        return highestBidder;
    }

    public int getHighestBid() {
        return highestBid;
    }

    // wzorce:
    // FACTORY: 3 rodzaje aukcji, rozniace sie zasadami
    // 1. normal      --> wygrywa highestBider w rundie nr '0'
    // 2. prelongated --> wygrywa highestBider w rundie nr '0', kazdy bid wydluza aukcje o 1 runde, koniec gdy pojawi sie runda bez bidow
    // 3. reversed    --> kazdy bid obniza cene o '1', kazdy bid kosztuje bidera '1', bider widzi cene dopiero po zlozeniu bidu, bider wtedy bierze albo nie bierze, jak nie bierze to nastepna runda

    // Simplest of the factory is introduction of a static method in the base class itself, which creates the required object based on the type
    // Define an interface for creating an object, but let subclasses decide which class to instantiate.
    // Factory Method lets a class defer instantiation to subclasses.


    //methods:

    private void iterateRoundsNormal() {
        //  1 runda to jeden bid: po każdym bidzie: rounnds = rounds - 1;
        //  jak rounds = 0: koniec aukcji: active = false;
        this.rounds = this.rounds - 1;
        if (this.rounds <= 0) {
            this.active = false;
        }
    }
    private void iterateRoundsPrelongated() {
        //  1 runda to jeden bid lub czas 10s
        //  kazdy bid wydluza aukcje o 1 runde: rounnds = rounds + 1;
        //  koniec gdy pojawi sie runda bez bidow: active = false;
        this.rounds = this.rounds + 1;
        countdownToEndAuction();
    }
//    private void iterateRoundsReversed() {
//        //  kazdy bid obniza cene o '1'
//        //  kazdy bid kosztuje bidera '1'
//        //  bider wtedy bierze albo nie bierze, jak nie bierze to nastepna runda
//
//    }



    public void bid(User buyer, int bidAmount) {
        if (this.active && bidAmount > this.highestBid) {
            this.highestBidder = buyer;
            this.highestBid = bidAmount;
            iterateRoundsNormal();
        } else System.out.println("Bidding blocked");
        // TODO: do try/catch instead and manage exceptions: bidToSmall, auctionIsOver
    }


    // odliczanie pustych rund do końca aukcji
    private void countdownToEndAuction(){
        TimeUnit.SECONDS.sleep(10);
        this.rounds--;
        if (this.rounds <= 0){
            this.active = false;
        }
        User winner = this.getHighestBidder();
        if(winner != null){
            System.out.println("The winner is: " + winner.getLogin());
        }
        else System.out.println("There were no offers");

    }



}


