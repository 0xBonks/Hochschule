import de.i8k.java.testing.TestHelper;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class GaspreisrechnerTest {

    static {
        Locale.setDefault(Locale.GERMAN);
    }

    @Test
    public void ueberpruefeBeispielVomAufgabenblatt() {
        TestHelper.optionPaneHelper(
                () -> Gaspreisrechner.main(new String[0]),
                "1289.2", "12.5", "1816,16");
    }

    @Test
    public void ueberpruefeAlternativesBeispiel() {
        TestHelper.optionPaneHelper(
                () -> Gaspreisrechner.main(new String[0]),
                "888.3", "34.2", "3423,81");
    }


}
