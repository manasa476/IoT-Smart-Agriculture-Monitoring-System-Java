# 🌱 IoT Smart Agriculture Monitoring System (Java)

## 📖 Overview

The **IoT Smart Agriculture Monitoring System** is a Java-based simulation project that demonstrates how IoT technology can be used to monitor agricultural conditions and automate irrigation decisions. The system virtually simulates environmental sensors, processes sensor data, generates alerts, controls irrigation logic, and stores historical data in a CSV file.

This project is designed for students and beginners who want to learn IoT concepts without requiring physical hardware.

---

## 🚀 Features

- 🌱 Virtual Soil Moisture Sensor Simulation
- 🌡️ Temperature Monitoring
- 💧 Humidity Monitoring
- ☀️ Light Intensity Monitoring
- 🚰 Water Level Monitoring
- 🔌 Automatic Pump ON/OFF Logic
- ⚠️ Real-Time Alert Generation
- 📊 Console-Based Dashboard
- 📝 CSV Data Logging
- 🔄 Continuous Sensor Monitoring Loop
- 📂 GitHub Portfolio Ready

---

## 🎯 Problem Statement

Traditional irrigation methods often lead to water wastage because farmers manually monitor field conditions. This project simulates an IoT-based smart farming system that continuously monitors environmental conditions and automatically determines whether irrigation is required.

---

## 🏗️ Project Architecture

```text
+---------------------+
|  Virtual Sensors    |
|---------------------|
| Soil Moisture       |
| Temperature         |
| Humidity            |
| Light Intensity     |
| Water Level         |
+----------+----------+
           |
           v
+---------------------+
|  Sensor Simulator   |
+----------+----------+
           |
           v
+---------------------+
| Threshold Checking  |
| & Pump Logic        |
+----------+----------+
           |
    +------+-------+
    |              |
    v              v
+--------+    +-----------+
| Alerts |    | Dashboard |
+--------+    +-----------+
       \          /
        \        /
         v      v
      +-------------+
      | CSV Logging |
      +-------------+
```

---

## 🛠️ Tech Stack

| Category        | Technology              |
| --------------- | ----------------------- |
| Language        | Java                    |
| IDE             | VS Code / IntelliJ IDEA |
| Data Storage    | CSV File                |
| Version Control | Git & GitHub            |
| IoT Simulation  | Java Random Class       |

---

## 📂 Project Structure

```text
IoT-Smart-Agriculture-Monitoring-System/
│
├── src/
│   ├── Main.java
│   ├── SensorSimulator.java
│   ├── IrrigationController.java
│   ├── AlertSystem.java
│   ├── Dashboard.java
│   └── DataLogger.java
│
├── data/
│   └── Sensor_data.csv
│
├── images/
├── outputs/
│
├── README.md
├── .gitignore
└── LICENSE
```

---

## ⚙️ How It Works

1. Virtual sensors generate environmental data.
2. The system reads soil moisture, temperature, humidity, light intensity, and water level.
3. Threshold conditions are checked.
4. If soil moisture is below the threshold, the irrigation pump is turned ON.
5. Alerts are displayed for abnormal conditions.
6. Sensor readings are displayed on the dashboard.
7. Data is saved to a CSV file for historical analysis.
8. The cycle repeats every few seconds.

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/manasa476/IoT-Smart-Agriculture-Monitoring-System-Java.git
```

### 2. Open the Project

Open the folder using **VS Code** or **IntelliJ IDEA**.

### 3. Compile the Source Files

```bash
javac src/*.java
```

### 4. Run the Application

```bash
java -cp src Main
```

---

## 📋 Sample Console Output

```text
========== SMART AGRICULTURE DASHBOARD ==========
Soil Moisture : 35%
Temperature   : 36 °C
Humidity      : 70%
Light Level   : 850 Lux
Water Level   : 15%
Pump Status   : PUMP ON
=================================================

--------------- ALERTS ---------------
ALERT: Soil moisture is LOW. Irrigation required.
ALERT: Temperature is HIGH.
ALERT: Water tank level is LOW.
--------------------------------------

Data successfully saved to sensor_data.csv
```

---

## 📊 CSV Data Logging

Sensor data is automatically stored in:

```text
data/Sensor_data.csv
```

Example:

```csv
SoilMoisture,Temperature,Humidity,LightIntensity,WaterLevel,PumpStatus
35,36,70,850,15,PUMP ON
48,30,62,760,40,PUMP OFF
28,38,75,920,18,PUMP ON
```

---

## 📸 Suggested Screenshots

Add the following screenshots to the `images/` folder and include them here:

- Project Folder Structure
- VS Code Project Window
- Console Dashboard Output
- Alert Messages
- CSV File Output
- GitHub Repository Home Page

---

## 🔮 Future Enhancements

- ESP32/Arduino hardware integration
- MQTT communication
- ThingSpeak or Blynk cloud dashboard
- Email/SMS notifications
- Weather API integration
- AI-based irrigation prediction
- Web dashboard for real-time monitoring

---

## 💼 Learning Outcomes

Through this project, I learned:

- Java Object-Oriented Programming
- IoT System Architecture
- Sensor Data Simulation
- Automation Logic
- CSV File Handling in Java
- Git and GitHub Workflow
- Project Documentation

---

## 🎤 Interview Summary

**Explain your project:**

> I developed a Java-based IoT Smart Agriculture Monitoring System that simulates environmental sensors such as soil moisture, temperature, humidity, light intensity, and water level. The system continuously monitors these values, automatically determines irrigation requirements, generates alerts for abnormal conditions, displays a real-time dashboard, and stores all sensor readings in a CSV file for historical analysis. The project demonstrates IoT concepts, automation logic, and data management without requiring physical hardware.

---

## 👩‍💻 Author

**Manasa Hiremath**

- GitHub: https://github.com/manasa476
- Repository: https://github.com/manasa476/IoT-Smart-Agriculture-Monitoring-System-Java

---

## 📄 License

This project is developed for educational and portfolio purposes.
