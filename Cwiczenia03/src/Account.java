/*
Autorzy:   Artur Dembicki 16323
Cw 2 Zad 3
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf
 */

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            //subtract amount from balance
            balance = balance - amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){
            //transfer amount to given Account
            balance = balance - amount;
            another.balance = another.balance + amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString(){
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
