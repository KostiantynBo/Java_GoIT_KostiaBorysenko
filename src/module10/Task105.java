package module10;


public class Task105 {

    void checkString(String string) throws FirstException105 {
        if (string.equals("system"))
            System.out.println("happy");
        else if (string.equals("system3")) {
            throw new ThirdException105("bad string 3");
        } else if (string.equals("system2")) {
            throw new SecondException105("bad string 2");
        } else {
            throw new FirstException105("bad string 1");
        }
    }
}
