import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class December$8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream in = new FileInputStream(name);

        String st = "";
        char ch;
        while (in.available()>0){
            ch =(char) in.read();
            st+=ch;
        }
        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher= pattern.matcher(st);

        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
        in.close();
        reader.close();
    }
}
