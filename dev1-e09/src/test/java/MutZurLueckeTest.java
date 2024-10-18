import de.i8k.karalight.world.RepresentationMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import de.i8k.karalight.Kara;
import de.i8k.karalight.test.TestKaraController;
import de.i8k.karalight.world.World;

public class MutZurLueckeTest {

    @Test
    public void testeWeltA() {
        // arrange
        World begin = new World("Welt1.world");
        Kara.setController(new TestKaraController(begin));

        // act
        MutZurLuecke.main(new String[0]);

        // assert
        World expected = new World("Welt1Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

    @Test
    public void testeWeltB() {
        // arrange
        World begin = new World("Welt2.world");
        Kara.setController(new TestKaraController(begin));

        // act
        MutZurLuecke.main(new String[0]);

        // assert
        World expected = new World("Welt2Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

    @Test
    public void testeWeltC() {
        // arrange
        World begin = new World("Welt3.world");
        Kara.setController(new TestKaraController(begin));

        // act
        MutZurLuecke.main(new String[0]);

        // assert
        World expected = new World("Welt3Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

}
