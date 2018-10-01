/**
 * @author DarrenClarke
 */
public class PremiumMember extends Member {
	
	
	public PremiumMember(String name, String email, String address, String gender, double startingWeight, double startingHeight) {
		super(name, email, address, gender, startingWeight, startingHeight);
	}
	
	public String toString()
    {
        return "Name: " + getName()
             + ", Email: " + getEmail()
             + ", Address: " + getAddress()
             + ", Gender: " + getGender()
      	 	 + ", Height: " + getStartingHeight()
      	 	 + ", Weight: " + getStartingWeight();
    }

}
