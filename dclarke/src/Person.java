/**
 * @author DarrenClarke
 */
public abstract class Person {
	
	private String name;
	private String email;
	private String address;
	private String gender;

	public Person(String email, String name,  String address, String gender) 
	{
		this.name = name;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
    public String toString()
    {
        return "Email Address: " + email
             + ", Name: " + name
             + ", Address: " + address
             + ", Gender: " + gender;
    }
}
