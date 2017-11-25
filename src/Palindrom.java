import javax.swing.text.html.parser.Parser;
import java.io.*;
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
            String text = "А Лида гадила. Вор влетел в ров! Золото лоз?";
            bufferedWriter.write(text);

            System.out.println("String wrote");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D://note2.txt"))){

            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);

                String[] strings = s.split("[.|!|?]");

                StringBuilder st = new StringBuilder();

                for (int i = 0; i < strings.length; i++) {
                    System.out.println(strings[i]);
                    st.append(strings[i]);
                    st.append("\n");
                }
                System.out.println(st);
                st.reverse();
                System.out.println(st);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
