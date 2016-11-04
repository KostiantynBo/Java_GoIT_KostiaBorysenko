package module10;

public class Task104 {

    public static void f(){
        try {
            g();
        } catch (TestExeption e) {
            System.out.println(e);
            throw new RuntimeException("Inside the catch");
        }
    }

    private static void g() throws TestExeption {
        throw new TestExeption("TestException");
    }

}

