public class Main {

    public static void main(String[] args) {

        SensorSimulator sensor = new SensorSimulator();
        IrrigationController irrigation = new IrrigationController();
        Dashboard dashboard = new Dashboard();
        AlertSystem alert = new AlertSystem();
        DataLogger logger = new DataLogger();

        System.out.println("==========================================");
        System.out.println("   IoT Smart Agriculture Monitoring");
        System.out.println("   Starting Sensor Monitoring...");
        System.out.println("==========================================");

        while (true) {

            // Read sensor values
            int soil = sensor.getSoilMoisture();
            int temp = sensor.getTemperature();
            int humidity = sensor.getHumidity();
            int light = sensor.getLightIntensity();
            int water = sensor.getWaterLevel();

            // Check irrigation status
            String pumpStatus = irrigation.checkPumpStatus(soil);

            // Display dashboard
            dashboard.display(
                    soil,
                    temp,
                    humidity,
                    light,
                    water,
                    pumpStatus
            );

            // Generate alerts
            alert.generateAlerts(soil, temp, water);

            // Save data to CSV
            logger.saveData(
                    soil,
                    temp,
                    humidity,
                    light,
                    water,
                    pumpStatus
            );

            // Wait for 5 seconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Monitoring interrupted.");
            }
        }
    }
}