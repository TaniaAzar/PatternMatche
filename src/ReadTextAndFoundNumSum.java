import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadTextAndFoundNumSum {
    public static void main(String[] args) {

        //create the file
        File newFile = new File("D://note.txt");
        try {
            boolean create = newFile.createNewFile();
            if (create){
                System.out.println("Файл был создан");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //write data in the file
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://note.txt"))) {

            String text = "123 Hello!!";
            bufferedWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //find patter and look for the sum from integers
        try (BufferedReader reader = new BufferedReader(new FileReader("D://note.txt"))) {
            Pattern pattern = Pattern.compile("[0-9]");

            String s;
            int sum = 0;
            while ((s = reader.readLine()) != null){
                System.out.println(s);

                Matcher matcher = pattern.matcher(s);
                while (matcher.find()){
                    System.out.print(matcher.group());
                    sum += Integer.parseInt(matcher.group());
                }

                System.out.println("\nСумма целых чисел = " + sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
