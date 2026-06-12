public class AlertSystem {

    public void generateAlerts(int soil, int temp, int waterLevel) {

        System.out.println("\n--------------- ALERTS ---------------");

        boolean alertGenerated = false;

        if (soil < 40) {
            System.out.println("ALERT: Soil moisture is LOW. Irrigation required.");
            alertGenerated = true;
        }

        if (temp > 35) {
            System.out.println("ALERT: Temperature is HIGH.");
            alertGenerated = true;
        }

        if (waterLevel < 20) {
            System.out.println("ALERT: Water tank level is LOW.");
            alertGenerated = true;
        }

        if (!alertGenerated) {
            System.out.println("No alerts. All sensor values are within normal range.");
        }

        System.out.println("--------------------------------------\n");
    }
}