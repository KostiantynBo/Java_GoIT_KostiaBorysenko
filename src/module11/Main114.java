package module11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main114 {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        //map.put("Android", "iOS");
        map.put("you", "YOU");
        String word = "YOU";
        //read file
        BufferedReader br;
        try {
            FileReader fileReader = new FileReader("/Users/KotestoMac/Desktop/K.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        // save to string var

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        br.close();

        String result = sb.toString();
        System.out.println(countWord(result,word));

        }

    public static int countWord(String chain, String word){
        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(chain);

        int count = 0;
        while(m.find()) {
            count++;
        }

        return count;
    }

}

