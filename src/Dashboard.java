public class Dashboard {

    public void display(int soil, int temp,
                        int humidity, int light,
                        int water, String pump) {

        System.out.println("\n========== SMART AGRICULTURE DASHBOARD ==========");
        System.out.println("Soil Moisture : " + soil + "%");
        System.out.println("Temperature   : " + temp + " °C");
        System.out.println("Humidity      : " + humidity + "%");
        System.out.println("Light Level   : " + light + " Lux");
        System.out.println("Water Level   : " + water + "%");
        System.out.println("Pump Status   : " + pump);
        System.out.println("=================================================\n");
    }
}