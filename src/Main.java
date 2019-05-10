
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








    }
}

