
/*
Zadania z POJ 2019
Autor: Artur Dembicki 16323
email: s16323@pjwstk.edu.pl
repo: https://github.com/s16323/PJATK_POJ_2019
*/


public class Main {

    public static void main(String[] args) {

        //Flagi.wyswietlFlage(1);
        Human artur = new Human(33, 85, 176, "Artur", "male", 16323, 44);
        System.out.println(artur.getAge());

        Times time = new Times();
        System.out.println(time.getChannelListName());

        InvoiceItem item = new InvoiceItem("0001", "deskrypszon", 666, 6.90);
        System.out.println(item.toString());
        System.out.println(item.getTotal());

        Account Account001 = new Account("001", "Account001", 1234);
        Account Account002 = new Account("002", "Account002", 50);
        System.out.println(Account001.toString());
        Account001.credit(100);
        System.out.println(Account001.toString());
        Account001.transferTo(Account002, 1000);
        System.out.println(Account001.toString());
        System.out.println(Account002.toString());






    }
}

