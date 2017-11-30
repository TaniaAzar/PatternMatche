import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhrasesInTheText {
    public static void main(String[] args) {

        String text = "В Петербурге \"мало\" зелени, \"зато\" много воды и неба";
        System.out.println(text);

        Pattern pattern = Pattern.compile("\"(.*?)\"");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
