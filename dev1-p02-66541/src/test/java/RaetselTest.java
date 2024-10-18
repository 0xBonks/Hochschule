import de.i8k.karalight.Kara;
import de.i8k.karalight.test.TestKaraController;
import de.i8k.karalight.world.RepresentationMode;
import de.i8k.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaetselTest {

    @Test
    public void ueberpruefeErgebnis() {
        // arrange
        World begin = new World("Raetsel.world");
        Kara.setController(new TestKaraController(begin));

        // act
        Raetsel.main(new String[0]);

        // assert
        World expected = new World("RaetselLoesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");

    }

}
