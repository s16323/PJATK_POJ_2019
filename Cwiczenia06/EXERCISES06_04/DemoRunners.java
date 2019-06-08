/*
Zad 6 Cwiczenia 4
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            07.06.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

//package Runner;

public class DemoRunners{
    public static void main(String[] args){
        Machine machine = new Machine();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();
        Athlete athlete = new Athlete();

        machine.run();
        politicalCandidate.run();
        athlete.run();
    }

}