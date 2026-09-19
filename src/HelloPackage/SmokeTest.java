package HelloPackage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * CI smoke test: this repository has no build manifest and no existing test
 * suite, so this is the one real assertion the workflow runs -- it fails
 * loudly if HelloWorld.java stops printing what it has always printed.
 */
public class SmokeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer, true, "UTF-8"));
        try {
            HelloWorld.main(new String[0]);
        } finally {
            System.setOut(original);
        }

        String expected = "Hello World!";
        String actual = buffer.toString("UTF-8").trim();
        if (!expected.equals(actual)) {
            throw new AssertionError(
                "expected HelloPackage.HelloWorld to print \"" + expected
                    + "\" but it printed \"" + actual + "\"");
        }
        System.out.println("smoke test passed: HelloPackage.HelloWorld prints \"" + expected + "\"");
    }
}
