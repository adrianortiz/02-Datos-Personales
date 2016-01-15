import javax.swing.JOptionPane;

/**
 * 
 * @author Adrian
 *
 */
public class AppDatos {

	/**
	 * Este programa genera una instancia de la clase Alumno
	 * y lo muestra en un showMessageDialog
	 * @param args
	 */
	public static void main(String[] args) {

		Alumno al = new Alumno("Adrian", "25", "29260108", "Masculino", "Ortiz", "Martinez", "80", "1.73", "Café",
				"adrian@gmai.com");

		JOptionPane.showMessageDialog(null,
				String.format(
						"Hola %s, \nTu edad es %s y \nTu teledono es %s \nTu sexo es: %s. \nTu Apellido Paterno es %s. \nTu Apellido Materno es %s. \nTu peso es %s. \nTu estatura es %s. \nColor de ojos es %s, \nTu correo es %s",
						al.getNombre(), al.getEdad(), al.getTelefono(), al.getSexo(), al.getPaterno(), al.getMaterno(),
						al.getPeso(), al.getEstatura(), al.getColorOjos(), al.getMail()));
	}
}
