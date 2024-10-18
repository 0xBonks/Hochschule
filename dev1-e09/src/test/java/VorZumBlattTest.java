import de.i8k.karalight.Kara;
import de.i8k.karalight.test.TestKaraController;
import de.i8k.karalight.world.Bug;
import de.i8k.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VorZumBlattTest {

    @Test
    public void testeWelt1() {
        // arrange
        World begin = new World("Next1.world");
        Kara.setController(new TestKaraController(begin));

        // act
        VorZumBlatt.main(new String[0]);

        Assertions.assertFalse(
                begin.getElements(7, 1, (e) -> e instanceof Bug).isEmpty(),
                "Kara steht nicht auf dem richtigen Blatt!");
    }

    @Test
    public void testeWelt2() {
        // arrange
        World begin = new World("Next2.world");
        Kara.setController(new TestKaraController(begin));

        // act
        VorZumBlatt.main(new String[0]);

        Assertions.assertFalse(
                begin.getElements(3, 2, (e) -> e instanceof Bug).isEmpty(),
                "Kara steht nicht auf dem richtigen Blatt!");
    }

    @Test
    public void testeWelt3() {
        // arrange
        World begin = new World("Next3.world");
        Kara.setController(new TestKaraController(begin));

        // act
        VorZumBlatt.main(new String[0]);

        Assertions.assertFalse(
                begin.getElements(3, 4, (e) -> e instanceof Bug).isEmpty(),
                "Kara steht nicht auf dem richtigen Blatt!");
    }
}
