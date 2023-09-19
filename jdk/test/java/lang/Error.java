/*
 * @test
 * @bug 6666666
 * @summary timeout error
 * @run main/othervm/timeout=5 Error
 */

public class Error {

    public static void main(String[] args) throws Throwable {
    	Thread.sleep(99999);
    }
}
