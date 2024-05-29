package duplicatedCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Tienes el siguiente código que maneja la lectura de archivos 
 * en diferentes partes de tu aplicación. 
 * Refactoriza el código para eliminar la duplicación.
 */

public class FileHandler {
	public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
