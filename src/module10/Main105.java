package module10;

public class Main105 {
    public static void main(String[] args){
        Task105 task105 = new Task105();
        try {
            task105.checkString("system2");
        } catch (FirstException105 firstException105) {
            firstException105.printStackTrace();
        }
    }
}
