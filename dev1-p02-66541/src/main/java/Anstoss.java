import static de.i8k.karalight.Kara.*;

/**
 * Hauptprogramm. Hier können Sie Kara programmieren.
 */
public class Anstoss {


    /**
     * rechtskurve laufen.
     *
     */
    public static void moveRight() {
        turnRight();
        move();
    }

    /**
     * linkskurve laufen.
     *
     */
    public static void moveLeft() {
        turnLeft();
        move();
    }

    /**
     * Main-Methode. Hier können Sie Java programmieren und dabei die folgenden Kara-Befehle direkt
     * verwenden:
     * <ul>
     *   <li>move() - Kara bewegt sich einen Schritt nach vorn.</li>
     *   <li>turnRight() bzw. turnLeft() - Kara dreht sich nach rechts bzw. links</li>
     *   <li>pickLeaf() - Kara nimmt ein Blatt auf (geht nur, wenn eins da ist!)</li>
     *   <li>putLeaf() - Kara legt ein Blatt ab (geht nur, wenn keins da ist!)</li>
     * </ul>
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        // Programm hier ergänzen!
        for (int i = 1; i <= 6; i++) {
            move();
        }
        moveRight();
        moveLeft();
        moveLeft();
        moveLeft();
        moveRight();

        moveRight();
        move();
        move();

        moveLeft();
        moveRight();
        moveRight();
        moveRight();
        moveLeft();
        moveLeft();
    }
}
