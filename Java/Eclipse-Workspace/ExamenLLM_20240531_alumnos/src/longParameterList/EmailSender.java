package longParameterList;

import java.util.List;


/*
 * Dada una clase EmailSender con un método sendEmail que toma una larga lista de parámetros 
 * para enviar un correo electrónico, debes refactorizar el código para reducir la cantidad 
 * de parámetros pasados al método. 
 * En lugar de utilizar una lista extensa de parámetros, encapsula estos datos en una clase EmailDetails. 
 * Esto ayudará a mejorar la encapsulación y la manejabilidad del código.
 */

public class EmailSender {
	/**
	 * 
	 * @param emailDetails
	 * Llama a la clase EmailDetails.
	 */
	public void sendEmail(EmailDetails emailDetails) {
        // Email sending logic
    }
}

class EmailDetails {
	/**
	 * 
	 * @param recipient
	 * Es un String que guarda un recipiente.
	 * @param sender
	 * Es un String que guarda el remitente.
	 * @param subject
	 * Es un String que guarda el asunto.
	 * @param body
	 * Es un String que guarda el contenido o el cuerpo del correo.
	 * @param attachments
	 * Es una lista de String que guarda los archivos adjuntados.
	 * @param isHtml
	 * Es un booleano que dice si es un HTML o no.
	 * @param smtpServer
	 * Es un String que guarda el smtpServer.
	 * @param port
	 * Es un int que guarda el numero del puerto.
	 * @param username
	 * Es un String que guarda el nombre del usuario.
	 * @param password
	 * Es un String que guarda la contraseña.
	 */
	public EmailDetails(String recipient, String sender, String subject, String body, List<String> attachments, boolean isHtml, String smtpServer, int port, String username, String password) {
		// Todos los this
	}
}
