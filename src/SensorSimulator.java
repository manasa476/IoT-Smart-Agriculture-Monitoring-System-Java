import java.util.Random;

public class SensorSimulator {
    Random random = new Random();

    public int getSoilMoisture() {
        return 20 + random.nextInt(81); // 20-100%
    }

    public int getTemperature() {
        return 20 + random.nextInt(21); // 20-40°C
    }

    public int getHumidity() {
        return 30 + random.nextInt(51); // 30-80%
    }

    public int getLightIntensity() {
        return 200 + random.nextInt(801); // 200-1000 lux
    }

    public int getWaterLevel() {
        return 10 + random.nextInt(91); // 10-100%
    }
}