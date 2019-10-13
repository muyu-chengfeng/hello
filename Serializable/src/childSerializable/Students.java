package childSerializable;

import java.io.Serializable;

public class Students extends Person implements Serializable{
	public static final long serialVersionUID = 1l;
	private  String professional = "Ñ§Éú";
	public String getProfessional() {
		return this.professional;
	}
}
