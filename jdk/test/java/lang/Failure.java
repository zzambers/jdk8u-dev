/*
 * @test
 * @bug 6666666
 * @summary fails
 * @run main/othervm Failure
 */

public class Failure {

    public static void main(String[] args) throws Throwable {
    	throw new Exception("Failure");
    }
}
