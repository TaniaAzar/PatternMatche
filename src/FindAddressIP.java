import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAddressIP {
    public static void main(String[] args) {

        //create the file
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://Java//note.txt"))) {

            String text = "123.123.12.23 Hello my friend";
            bufferedWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //finding of pattern and replace it
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://Java//note.txt"))) {
            Pattern pattern = Pattern.compile("[/^(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])" +
                    "(\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])){3}$/]");

            String s;
            String newStr = null;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                   newStr = matcher.group().replaceAll(matcher.group(),"hjh");
                }
            }
            System.out.println(newStr);
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
