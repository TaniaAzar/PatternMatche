import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrom {
    public static void main(String[] args) {

        File file = new File("D://note2.txt");
        try {
            boolean create = file.createNewFile();
            if (create){
                System.out.println("File created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://note2.txt"))){
            String text = "А Лида гадила.";
            bufferedWriter.write(text);

            System.out.println("String wrote");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D://note2.txt"))){

            Pattern pattern = Pattern.compile("[а-яА-Я\\.|!|?]");
            StringBuilder stringBuilder = new StringBuilder();

            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);

                String[] strings = s.split("[.|!|?]");

                StringBuilder st = new StringBuilder();

                int length = strings.length;

                for (int i = 0; i < strings.length; i++) {

                    st.append(strings[i].trim().replaceAll(" ",""));

                    System.out.println(st.toString());
                    System.out.print(st.reverse().toString());
                    if (st.toString().equalsIgnoreCase(st.reverse().toString())){
                        System.out.println("  - перложение является палиндромом");
                    }else {
                        System.out.println("  - перложение не является палиндромом");
                    }
                }

                System.out.println("----------");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
