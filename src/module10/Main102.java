package module10;


public class Main102 {
    public static void main(String[] args){
        try {
            checkString("test");
        } catch (TestExeption e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkString(String string) throws TestExeption {
        if (string.equals("system"))
            System.out.println("happy");
        else {
            throw new TestExeption("bad string");
        }
    }
}
