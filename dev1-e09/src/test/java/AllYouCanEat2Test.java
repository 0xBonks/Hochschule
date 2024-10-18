import de.i8k.karalight.Kara;
import de.i8k.karalight.test.TestKaraController;
import de.i8k.karalight.world.RepresentationMode;
import de.i8k.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllYouCanEat2Test {

    @Test
    public void testeWeltA() {
        // arrange
        World begin = new World("AllYouCanEat21.world");
        Kara.setController(new TestKaraController(begin));

        // act
        AllYouCanEat2.main(new String[0]);

        // assert
        World expected = new World("AllYouCanEat21Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

    @Test
    public void testeWeltB() {
        // arrange
        World begin = new World("AllYouCanEat22.world");
        Kara.setController(new TestKaraController(begin));

        // act
        AllYouCanEat2.main(new String[0]);

        // assert
        World expected = new World("AllYouCanEat22Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

    @Test
    public void testeWeltC() {
        // arrange
        World begin = new World("AllYouCanEat23.world");
        Kara.setController(new TestKaraController(begin));

        // act
        AllYouCanEat2.main(new String[0]);

        // assert
        World expected = new World("AllYouCanEat23Loesung.world");
        // ignores Kara's position!
        Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
                "\n" + begin.getRepresentation(RepresentationMode.NONE),
                "Kara hat die Aufgabe nicht gelöst!");
    }

}
