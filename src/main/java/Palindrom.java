import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrom {
    public static void main(String[] args) {

        File file = new File("C://note2.txt");
        try {
            boolean create = file.createNewFile();
            if (create){
                System.out.println("File created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://note2.txt"))){
            String text = "А Лида гадила. А крот у хуторка.";
            bufferedWriter.write(text);

            System.out.println("String wrote");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C://note2.txt"))){

            String s;
            while ((s = bufferedReader.readLine()) != null){

                String[] strings = s.split("[.|!|?]");

                StringBuilder st = new StringBuilder();

                for (int i = 0; i < strings.length; i++) {
                    System.out.println(strings[i]);
                    st.append(strings[i].trim());
                }
                System.out.println(st);


                st.reverse();
                System.out.println(st);
                System.out.println("----------");

        //       StringBuilder st = new StringBuilder();
        //        st.append(s.replaceAll("[.|!|?|]", "\n").trim().replaceAll(" ",""));
         //       System.out.println(st.toString());

        //       System.out.println(st.reverse().toString());
        //        if (st.toString().equalsIgnoreCase(st.reverse().toString())){
         //           System.out.print(" = true");
                //}
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
