import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZungenbrecherTest {

    private static void execute() {
        Zungenbrecher.main(new String[0]);
    }

    @Test
    public void hatKorrekteAusgabe() throws Exception {
        // act
        String output = tapSystemOut(ZungenbrecherTest::execute);

        // assert
        String expected =
                "Blaukraut bleibt Blaukraut..."
                        + System.lineSeparator()
                        + "...und Brautkleid bleibt Brautkleid!";
        Assertions.assertEquals(expected, output.trim(), "Ausgabe ist falsch!");
    }
}
