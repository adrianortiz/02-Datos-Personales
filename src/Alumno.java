/**
 * 
 * @author Adrian
 *
 */
public class Alumno {
	
	private String nombre;
	private String edad;
	private String telefono;
	
	private String sexo;
	private String paterno;
	private String materno;
	private String peso;
	private String estatura;
	private String colorOjos;
	private String mail;
	
	/**
	 * Constructor base para seguridad
	 */
	public Alumno(){}

	/**
	 * 
	 * @param nombre nombre de la persona en formato String
	 * @param edad edad de la persona en formato String
	 * @param telefono telefono de la persona en formato String
	 * @param sexo sexo de la persona en formato String
	 * @param paterno paterno de la persona en formato String
	 * @param materno materno de la persona en formato String
	 * @param peso peso de la persona en formato String
	 * @param estatura estatura de la persona en formato String
	 * @param colorOjos colorOjos de la persona en formato String
	 * @param mail mail de la persona en formato String
	 */
	public Alumno(String nombre, String edad, String telefono, String sexo, String paterno, String materno, String peso,
			String estatura, String colorOjos, String mail) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.sexo = sexo;
		this.paterno = paterno;
		this.materno = materno;
		this.peso = peso;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.mail = mail;
	}

	/**
	 * 
	 * @return nombre nombre de la persona en formato String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre Introduce el nombre de la persona en formato String
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return edad edad de la persona en formato String
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad Introduce la edad de la persona en formato String
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return telefono telefono de la persona en formato String
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono Introduce el telefono de la persona en formato String
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return sexo sexo de la persona en formato String
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo sexo de la persona en formato String
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * 
	 * @return paterno paterno de la persona en formato String
	 */
	public String getPaterno() {
		return paterno;
	}

	/**
	 * 
	 * @param paterno paterno de la persona en formato String
	 */
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	/**
	 * 
	 * @return materno materno de la persona en formato String
	 */
	public String getMaterno() {
		return materno;
	}

	/**
	 * 
	 * @param materno materno de la persona en formato String
	 */
	public void setMaterno(String materno) {
		this.materno = materno;
	}

	/**
	 * 
	 * @return peso peso de la persona en formato String
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * 
	 * @param peso peso de la persona en formato String
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * 
	 * @return estatura estatura de la persona en formato String
	 */
	public String getEstatura() {
		return estatura;
	}

	/**
	 * 
	 * @param estatura estatura de la persona en formato String
	 */
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	/**
	 * 
	 * @return colorOjos color de ojos de la persona en formato String
	 */
	public String getColorOjos() {
		return colorOjos;
	}

	/**
	 * 
	 * @param colorOjos color de ojos de la persona en formato String
	 */
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	/**
	 * 
	 * @return mail correo de la persona en formato String
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * 
	 * @param mail correo de la persona en formato String
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
}
