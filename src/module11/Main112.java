package module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main112 {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("love", "hate");
        map.put("you", "YOU");
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
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            result = result.replaceAll(key, value);
        }
        FileWriter fw = new FileWriter("/Users/KotestoMac/Desktop/K.txt");
        fw.write(result);
        fw.close();
    }
}
