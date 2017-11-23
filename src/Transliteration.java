import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transliteration {
    public static void main(String[] args) {

        String text = "Солнце ярко светит!";

        char[] chars = text.toCharArray();



    }
    public static String charChoose(char c){
        switch (c){
            case 'A':return "A";
            case 'а':return "a";
            case 'Б':return "B";
            case 'б':return "b";
            case 'В':return "V";
            case 'в':return "v";
            case 'Г':return "G";
            case 'г':return "g";
            case 'Д':return "D";
            case 'д':return "d";
            case 'Е':return "E";
            case 'е':return "e";
            case 'Ё':return "JE";
            case 'ё':return "je";
            case 'Ж':return "ZH";
            case 'ж':return "zh";
            case 'З':return "Z";
            case 'з':return "z";
            case 'И':return "I";
            case 'и':return "i";
            case 'Й':return "Y";
            case 'й':return "y";
            case 'К':return "K";
            case 'к':return "k";
            case 'Л':return "L";
            case 'л':return "l";
            case 'М':return "M";
            case 'м':return "m";

        }
        return String.valueOf(c);
    }
}
