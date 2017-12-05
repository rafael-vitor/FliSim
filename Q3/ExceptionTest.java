package Q3;

public class ExceptionTest {

    static public void checkBiggerThanFive(int n) throws Exception {
        if (n > 5) {
            throw new Exception("bigger than five exception");
        }
    }

    public static void main (String args[]) {


        boolean stop = false;

        int n = 10;

        while (!stop) {
            try {
                System.out.println("testing for n: " + n);

                ExceptionTest.checkBiggerThanFive(n);

                System.out.println("test succeeded: " + n);
                stop = true;
            }
            catch (Exception e) {
                System.out.println (e.getMessage());
                stop = false;
            }
            finally {
                n--;
            }
        }
    }
}
