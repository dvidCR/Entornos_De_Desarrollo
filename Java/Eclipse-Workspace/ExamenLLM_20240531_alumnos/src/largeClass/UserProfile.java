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

public class UserProfile {
	/**
	 * @see PersonalInfo
	 * @see AccountSettings
	 * @see ActivityHistory
	 * @see UserPreferences
	 */
    private String userId;
	private PersonalInfo personalInfo;
	private AccountSettings accountSettings;
	private ActivityHistory activityHistory;
	private UserPreferences userPreferences;
	
	/**
	 * 
	 * @param userId
	 * Es un String que guarda el id del usuario
	 * @param personalInfo
	 * Llama a la clase PersonalInfo
	 * @param accountSettings
	 * Llama a la clase AccountSettings
	 * @param activityHistory
	 * Llama a la clase ActivityHistory
	 * @param userPreferences
	 * Llama a la clase UserPreferences
	 */
    public UserProfile(String userId, PersonalInfo personalInfo, AccountSettings accountSettings, ActivityHistory activityHistory, UserPreferences userPreferences) {
      this.userId = userId;
      this.personalInfo = personalInfo;
      this.accountSettings = accountSettings;
      this.activityHistory = activityHistory;
      this.userPreferences = userPreferences;

    }
    
    /**
     * 
     * @param newEmail
     * Es un String que recibe el nuevo nombre para el Email.
     */
    public void updateEmail(String newEmail) {
        this.accountSettings.setEmail(newEmail);
    }
    
    /**
     * 
     * @param newPassword
     * Es un String que recibe la nueva contraseña.
     */
    public void changePassword(String newPassword) {
        this.accountSettings.setPassword(newPassword);;
    }
    
    /**
     * 
     * @param activity
     * Es un String que recibe la nueva actividad.
     */
    public void addActivity(String activity) {
        this.activityHistory.getActivityLog().add(activity);
    }
    
    /**
     * 
     * @param key
     * Es un String que recibe la nueva llave.
     * @param value
     * Es un String que recibe un nuevo valor.
     */
    public void updatePreference(String key, String value) {
        this.userPreferences.getPreferences().put(key, value);
    }

    // Other methods related to user profile management
}

class PersonalInfo {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	/**
	 * 
	 * @param name
	 * Es un String que guarda el nombre.
	 * @param address
	 * Es un String que guarda la direccion.
	 * @param phoneNumber
	 * Es un String que guarda el numero de telefono.
	 */
	public PersonalInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
}

class AccountSettings {
	
	private String email;
    private String password;
    private String accountStatus;
    
    /**
     * 
     * @param email
     * Es un String que guarda el Email.
     * @param password
     * Es un String que guarda la contraseña.
     * @param accountStatus
     * Es un String que guarda el estado de la cuenta.
     */
	public AccountSettings(String email, String password, String accountStatus) {
		this.email = email;
		this.password = password;
		this.accountStatus = accountStatus;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

class ActivityHistory {
	
	private List<String> activityLog;
	
	/**
	 * 
	 * @param activityLog
	 * Es un lista de tipo String que guarda el contenido de los logs de actividad.
	 */
	public ActivityHistory(List<String> activityLog) {
		this.activityLog = activityLog;
	}
	
	public List<String> getActivityLog() {
		return this.activityLog;
	}

}

class UserPreferences {
	
	private Map<String, String> preferences;
	
	/**
	 * 
	 * @param preferences
	 * Es Map de tipo String que guarda las preferencias del usuario.
	 */
	public UserPreferences(Map<String, String> preferences) {
		this.preferences = preferences;
	}

	public Map<String, String> getPreferences() {
		return this.preferences;
	}
	
}