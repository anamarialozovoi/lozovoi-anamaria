import java.io.*;

public class Logger {
    private static Logger instance;
    private String logFileName;

    private Logger() {

        logFileName = "application.log";
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        // Append the message to the log file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFileName, true));
            writer.write(message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public String getLogContents() {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(logFileName));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
