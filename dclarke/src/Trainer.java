/**
 * @author DarrenClarke
 */
public class Trainer extends Person {
		
	private String speciality;

	public Trainer(String name, String email, String address, String gender, String speciality) {
		super(name, email, address, gender);
		this.speciality = speciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	} 
	
	public String toString()
    {
        return "Name: " + getName()
             + ", Email: " + getEmail()
             + ", Address: " + getAddress()
             + ", Gender: " + getGender()
             + ", Speciality: " + speciality;
    }

}
	
