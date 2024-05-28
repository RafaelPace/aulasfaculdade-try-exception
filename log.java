import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogErros {

    public static void main(String[] args) {
        try {
            // Simulando um erro
            int result = 10 / 0;
        } catch (Exception e) {
            logError(e);
        }
    }

    public static void logError(Exception e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write("Erro ocorrido: " + e.toString());
            writer.newLine();
            for (StackTraceElement element : e.getStackTrace()) {
                writer.write("\tat " + element.toString());
                writer.newLine();
            }
            writer.write("----------------------------------------------------------------");
            writer.newLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
