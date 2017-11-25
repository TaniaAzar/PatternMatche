import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFoundInTheFile {
    public static void main(String[] args) {

        String text = "Привет +375(29)7345656. Мой номер телефона +375(29)5673423";
        System.out.println(text);

        Pattern pattern = Pattern.compile("\\+[0-9]{3}\\([0-9]{2}\\)[0-9]{7}?");

        Matcher matcher = pattern.matcher(text);

        ArrayList<String> numberPhone = new ArrayList<>();

        while (matcher.find()){
            System.out.println(matcher.group());
            numberPhone.add(matcher.group());
        }

        Collections.sort(numberPhone);

        System.out.println("Отсортированный список");
        for (String item : numberPhone){
            System.out.println(item);
        }
    }
}
