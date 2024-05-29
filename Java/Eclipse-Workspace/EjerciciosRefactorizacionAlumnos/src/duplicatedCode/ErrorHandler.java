package duplicatedCode;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *Supón que tienes múltiples métodos que manejan errores y 
 *loguean información en diferentes partes de tu aplicación. 
 *Refactoriza el código para eliminar la duplicación. 
 */

public class ErrorHandler {

    private static final Logger logger = Logger.getLogger(ErrorHandler.class.getName());

    public void processTask() {
        try {
            // Some processing logic
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error processing task", e);
            System.out.println("An error occurred while processing task: " + e.getMessage());
        }
    }
}