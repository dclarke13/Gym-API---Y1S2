/**
 * @author DarrenClarke
 */
public class StudentMember extends Member 
{
	
	private String studentID;
	private String collegeName;
	
	public StudentMember(String name, String email, String address, String gender, String collegeName, String studentID, double startingWeight, double startingHeight) 
	{
		super(name, email, address, gender, startingHeight, startingWeight);
		this.collegeName = collegeName;
		this.studentID = studentID;
	}
	
	public String toString()
    {
        return "Email Address: " + getEmail()
             + ", Name: " + getName()
             + ", Address: " + getAddress()
             + ", Gender: " + getGender()
      	 	 + ", College Attended: " + getCollegeName()
        	 + ", Student ID: " + getStudentID()
      	 	 + ", Height: " + getStartingHeight()
      	 	 + ", Weight: " + getStartingWeight();
    }

	public String getStudentID() 
	{
		return studentID;
	}
	
	public String getCollegeName() 
	{
		return collegeName;
	}
	
	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}

	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	
}