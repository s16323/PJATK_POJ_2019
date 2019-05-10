//*******************************************************************
//FLAGI
//autorzy:
//Artur Dembicki 16323
//Aleksander Mojzych 15595
//Cwiczenie 1 zajecia POJ gr 3 PJATK
//23-02-2019
//*******************************************************************

public class Flagi
{
    public static void main(String[] args)
    {
        int rozmiar = 1; // wybierz rozmiar: 0, 1 , 2
        wyswietlFlage (rozmiar);

    }


    public static void wyswietlFlage(int i)
    {
        switch(i){
            case 0: rysuj_mala(); break;
            case 1: rysuj_srednia(); break;
            case 2: rysuj_duza(); break;
        }
    }

    public static void rysuj_mala()
    {
        System.out.println ("|---------|" + "-------");
        System.out.println ("|         |" + "   ##  ");
        System.out.println ("|#########|" + "   ##  ");
        System.out.println ("|#########|" + "-------");

    }

    public static void rysuj_srednia()
    {
        System.out.println ("|-----------------|" + "|------------------|");
        System.out.println ("|                 |" + "|                  |");
        System.out.println ("|                 |" + "|       ###        |");
        System.out.println ("|#################|" + "|      #####       |");
        System.out.println ("|#################|" + "|       ###        |");
        System.out.println ("|#################|" + "|__________________|");

    }

    public static void rysuj_duza()
    {
        System.out.println ("|---------------------------|" + "|----------------------|");
        System.out.println ("|                           |" + "|                      |");
        System.out.println ("|                           |" + "|         ######       |");
        System.out.println ("|                           |" + "|        ########      |");
        System.out.println ("|###########################|" + "|        ########      |");
        System.out.println ("|###########################|" + "|         #####        |");
        System.out.println ("|###########################|" + "|                      |");
        System.out.println ("|###########################|" + "|______________________|");

    }

}