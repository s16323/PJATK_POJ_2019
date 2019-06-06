/*
Autorzy: Aleksander Mojzych, Artur Dembicki  07.06.2019
 */

package Runner;

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