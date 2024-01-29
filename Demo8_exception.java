public class Demo8_exception {
    public static void main(String[] args) {

        int i=0;
        int j=0;

        try
        {
            j=18/i;
        }
        catch(Exception e)   // catch block will only run in case of exception.
        {
            System.out.println("Something went wrong"  + e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
