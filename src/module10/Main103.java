package module10;

import java.util.ArrayList;
import java.util.List;

public class Main103 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list = null;
        try {
            int i =list.size();
        } catch (Throwable t) {
            System.out.println(t.toString());
        }
    }
}
