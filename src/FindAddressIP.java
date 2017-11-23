import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAddressIP {
    public static void main(String[] args) {

        //create the file
        File newFile = new File("C://note.txt");
        try {
            boolean create = newFile.createNewFile();
            if (create){
                System.out.println("Файл создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //create the file
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://note.txt"))) {

            String text = "123.123.12.23 Hello my friend 123.123.12.23 fghgdeys 256.123.12.23";
            bufferedWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //finding of pattern and replace it
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C://note.txt"))) {
            Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])" +
                    "(\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])){3}");

            String s;
            String newStr = null;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                   newStr = s.replaceAll(matcher.group(),"[засекречено]");
                }
            }
            System.out.println(newStr);
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
