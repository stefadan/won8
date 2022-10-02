package acurs10reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpression {

    public static void main(String[] args) {

        //1. Inlocuiti intr-un text toate cuvintele care incep cu "m" si se termina cu "e".
        String str = "mere mar meridiane multeeridiane mariane marian34 ymmme";
        String regex = "\\bm\\w*(e)\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        System.out.println(str.replaceAll(regex, "*"));

        /*
        String word = null;
        System.out.println("Sirul de intrare: " + str);
        System.out.println("Regex: " + regex + "\r\n");
        System.out.println("Cuvintele care incep cu m si se termina cu e:");
        while (m.find()) {
            word = m.group();
            System.out.println(word);
        }
        if (word == null) {
            System.out.println("In sir nu sunt cuvinte care incep cu m si se termina cu e");
        }*/

        //2. Verificati ca un String e un double si poate fi convertit intr-un Double
        String text = "-34.2568"; //""2.52";
        if (text.matches("-?[0-9]{1,13}(\\.[0-9]*)?")){
            System.out.println(String.format("Text %s is double  %.10f",
                    text,
                    Double.parseDouble(text)));
            Double d = Double.parseDouble(text);
        }



    }

    }

