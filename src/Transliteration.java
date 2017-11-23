import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Transliteration {
    public static void main(String[] args) {

        String text = "Привет";


        Map<String,String> map = new HashMap<>();

        map.put("А","A");
        map.put("а","a");
        map.put("Б","B");
        map.put("б","b");
        map.put("В","V");
        map.put("в","v");
        map.put("Г","G");
        map.put("г","g");
        map.put("Д","D");
        map.put("д","d");
        map.put("Е","E");
        map.put("е","e");
        map.put("Ё","JO");
        map.put("ё","jo");
        map.put("Ж","ZH");
        map.put("ж","zh");
        map.put("З","Z");
        map.put("з","z");
        map.put("И","I");
        map.put("и","i");
        map.put("Й","J");
        map.put("й","j");
        map.put("К","K");
        map.put("к","k");
        map.put("Л","L");
        map.put("л","l");
        map.put("М","M");
        map.put("м","m");
        map.put("Н","N");
        map.put("н","n");
        map.put("О","O");
        map.put("о","o");
        map.put("П","P");
        map.put("п","p");
        map.put("Р","R");
        map.put("р","r");
        map.put("С","S");
        map.put("с","s");
        map.put("Т","T");
        map.put("т","t");
        map.put("У","U");
        map.put("у","u");
        map.put("Ф","F");
        map.put("ф","f");
        map.put("Х","H");
        map.put("х","h");
        map.put("Ц","C");
        map.put("ц","c");
        map.put("Ч","CH");
        map.put("ч","ch");
        map.put("Ш","SH");
        map.put("ш","sh");
        map.put("Щ","SHH");
        map.put("щ","shh");
        map.put("ы","y");
        map.put("ь","'");
        map.put("Э","EH");
        map.put("э","eh");
        map.put("Ю","JU");
        map.put("ю","ju");
        map.put("Я","JA");
        map.put("я","ja");

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            str.append(map.get(""+text.charAt(i)));
        }
        System.out.println(str);

    }
}
