/*
Autorzy: Aleksander Mojzych, Artur Dembicki 10.05.2019
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