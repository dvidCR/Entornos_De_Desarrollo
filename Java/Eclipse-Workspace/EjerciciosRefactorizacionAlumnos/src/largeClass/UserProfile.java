package largeClass;

import java.util.List;
import java.util.Map;

/*
 * Dada una clase UserProfile que maneja múltiples aspectos relacionados con el perfil del usuario, 
 * incluyendo información personal, configuración de la cuenta, historial de actividades y preferencias, 
 * debes refactorizar el código dividiendo esta clase en varias clases más pequeñas y bien delimitadas. 
 * La clase original contiene atributos y métodos que abarcan diferentes responsabilidades. 
 * Refactoriza el código para que cada responsabilidad se maneje en una clase separada, asegurando que cada 
 * clase tenga una única responsabilidad.
 */

/**
 * @param UserProfile
 * Le da valores a los atributos mediante los parametros
 * 
 * @param updateEmail
 * Cambia el E-mial
 * 
 * @param changePassword
 * Cambia la contraseña
 * 
 * @param addActivity
 * Añade una tarea
 * 
 * @param updatePreference
 * Actualiza las preferencias
 */

public class UserProfile {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private String accountStatus;
    private List<String> activityLog;
    private Map<String, String> preferences;

    public UserProfile(String userId, String name, String email, String password, String address, String phoneNumber, String accountStatus, List<String> activityLog, Map<String, String> preferences) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accountStatus = accountStatus;
        this.activityLog = activityLog;
        this.preferences = preferences;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void addActivity(String activity) {
        this.activityLog.add(activity);
    }

    public void updatePreference(String key, String value) {
        this.preferences.put(key, value);
    }

    // Other methods related to user profile management
}

