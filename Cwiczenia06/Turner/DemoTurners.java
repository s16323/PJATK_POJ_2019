/*
Autorzy: Aleksander Mojzych, Artur Dembicki  07.06.2019
 */

package Turner;

public class DemoTurners {
    public static void main(String[] args){
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();

        leaf.turn();
        page.turn();
        pancake.turn();
    }
}
