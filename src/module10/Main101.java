package module10;

public class Main101 {

    public static void main(String[] args) throws Exception{
        String a;

        try {
            a=null;
            a.toString();


        } catch (Exception e) {

            System.out.println("The String is null!");
        } finally {
            System.out.println("Finished!");
        }

    }
}
