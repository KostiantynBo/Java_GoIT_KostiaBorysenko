package module10;

public class Task104 {

    public void f() throws TestExeption {
        try {
            g();
        } catch (Exception e) {

            throw new TestExeption("Hi");
        }
    }

    private void g() throws TestExeption{
    }
}
