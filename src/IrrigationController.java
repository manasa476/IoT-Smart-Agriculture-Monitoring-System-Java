public class IrrigationController {

    public String checkPumpStatus(int soilMoisture) {
        if (soilMoisture < 40) {
            return "PUMP ON";
        } else {
            return "PUMP OFF";
        }
    }
}