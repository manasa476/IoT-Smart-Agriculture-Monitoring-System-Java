import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataLogger {

    private static final String FILE_PATH = "data/sensor_data.csv";

    public void saveData(int soil, int temp, int humidity,
                         int light, int water, String pumpStatus) {

        try {
            File file = new File(FILE_PATH);

            // Check if the file already exists
            boolean fileExists = file.exists();

            // Open file in append mode
            FileWriter writer = new FileWriter(file, true);

            // Add header only if file is new
            if (!fileExists) {
                writer.write("SoilMoisture,Temperature,Humidity,LightIntensity,WaterLevel,PumpStatus\n");
            }

            // Write sensor data
            writer.write(
                    soil + "," +
                    temp + "," +
                    humidity + "," +
                    light + "," +
                    water + "," +
                    pumpStatus + "\n"
            );

            writer.close();

            System.out.println("Data successfully saved to sensor_data.csv");

        } catch (IOException e) {
            System.out.println("Error while saving data to CSV file.");
            e.printStackTrace();
        }
    }
}
