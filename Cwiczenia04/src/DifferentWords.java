/*
Autorzy:   Artur Dembicki 16323
           Aleksander Mojzych 15595
Cw 4 Zad 6
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentWords {

    static void printUniquedWords(String str) {
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        HashMap<String, Integer> hm = new HashMap<>();
        while (m.find()) {
            String word = m.group();
            if (!hm.containsKey(word))
                hm.put(word, 1);
            else
                hm.put(word, hm.get(word) + 1);
        }
        Set<String> s = hm.keySet();
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            String w = itr.next();
            if (hm.get(w) == 1)
                System.out.println(w);
        }
    }
    public static void main(String[] args) {
        String str = "This is some sample text. Some text is sampled for this purpose, but this text is merely a sample.";
        printUniquedWords(str);
    }

}
