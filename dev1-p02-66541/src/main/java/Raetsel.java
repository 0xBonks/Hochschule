import static de.i8k.karalight.Kara.*;

/**
 * Hauptprogramm. Hier können Sie Kara programmieren.
 */
public class Raetsel {

    /**
     * rechtskurve laufen.
     *
     */
    public static void moveRight() {
        move();
        turnRight();
    }

    /**
     * linkskurve laufen.
     *
     */
    public static void moveLeft() {
        move();
        turnLeft();
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
        moveLeft();
        moveRight();
        move();
        pickLeaf();
        turnRight();
        turnRight();
        moveRight();
        moveLeft();
        move();
        moveRight();
        moveLeft();
        move();
        putLeaf();
    }
}
