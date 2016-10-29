package module10;

import java.util.ArrayList;
import java.util.List;

public class Main103 {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            list.get(0);
        } catch (Throwable t) {
            System.out.println("this element does not exist");
        }
    }
}
