import static javax.swing.JOptionPane.*;

public class Gaspreisrechner {

    /**
     * @param verbrauch der Verbrauch in Kubikmetern.
     * @param gasPreis der Gaspreis in Cent pro kWh.
     * @return die berechneten Gaskosten.
     */
    public static double gaspreis(double verbrauch, double gasPreis) {
        double verbrauchInKwh = verbrauch * 11.27;
        return verbrauchInKwh * (gasPreis / 100);
    }

    /**
    * main Function.
     * @param args not used
    * */
    public static void main(String[] args) {
        try {
            String verbrauchString = showInputDialog("Verbrauch in m³ eingeben: ");
            String gasPreisString = showInputDialog("Gaspreis in Cent/kWh eingeben: ");

            double verbrauch = Double.parseDouble(verbrauchString);
            double gasPreis = Double.parseDouble(gasPreisString);
            double kosten = gaspreis(verbrauch, gasPreis);
            String formattedKosten = String.format("%.2f", kosten);

            showMessageDialog(
                    null,
                    "Die berechneten Gaskosten betragen: " + formattedKosten + " Euro"
            );
        } catch (NumberFormatException var9) {
            System.out.println("Bitte richtige Werte eingeben!");
        }
    }
}
