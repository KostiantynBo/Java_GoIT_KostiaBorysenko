package module10;

public class TestExeption extends Exception {

    private String test;

    public TestExeption(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
