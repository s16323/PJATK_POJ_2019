/*
Autorzy:   Artur Dembicki 16323
           Aleksander Mojzych 15595
Cw 4 Zad 7
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/
import java.util.*;

public class DifferentWords2 {
    public static void main(String[] args) {
        String s = "This is some sample text. Some text is sampled for this purpose, but this text is merely a sample.";
        List<String> qw = new ArrayList<String>();
        Map<String, Integer> mmm = new HashMap<String, Integer>();
        for (String sp : s.split(" ")) {
            qw.add(sp);
        }
        for (String num : qw) {
            mmm.put(num, Collections.frequency(qw, num));
        }
        System.out.println(mmm);

    }
}