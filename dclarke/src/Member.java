/**
 * @author DarrenClarke
 */
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Member extends Person 
{
		
    private HashMap<Boolean, String> responses;
    private HashMap<String, String> assessments;

	private double startingHeight;
	private double startingWeight;
	double bmi;
	private String BmiCategory;	
	
	public Member(String name, String email, String address, String gender, double startingWeight , double startingHeight) 
	{
		super(name, email, address, gender);
		this.startingWeight = startingWeight;
		this.startingHeight = startingHeight;
	}
	    	    
	public double calculateBMI(double weight)
	{
		double height = getStartingHeight();
		double sqrHeight = height * height;
		double bmi = weight/sqrHeight;
		return bmi;
	}
	
	public String determineBmiCategory(double bmiValue)
	    {
	        responses.put(bmi<15, 
	                "VERY SEVERELY UNDERWEIGHT");
	        responses.put(bmi>15 && bmi<16, 
                    "SEVERELY UNDERWEIGHT");
	        responses.put(bmi>16 && bmi<18.5, 
            		"UNDERWEIGHT");
	        responses.put(bmi>18.5 && bmi<25, 
            		"NORMAL");
	        responses.put(bmi>25 && bmi<30, 
            		"OVERWEIGHT");
	        responses.put(bmi>30 && bmi<35, 
            		"MODERATELY OBESE");
	        responses.put(bmi>35 && bmi<40, 
            		"SEVERELY OBESE");
	        responses.put(bmi>40, 
            		"VERY SEVERELY OBESE");
	        return responses.put(bmi > 0, BmiCategory);
	    }
	
/*	public Assessment latestAssessment()
	{
		return getAssessments().get(sortedAssessmentDates().last());
	}
	
	public Sorted Date<Date> sortedAssessmentDates()
	{
		return new ReeSet<Date>(getAssessments().keyset());
	}
	
	public boolean isIdealBodyWeight (double weight)
	{
		doublefiveFeet = 60.0;
		double idealBodyWeight;
		double inches = //write method that converts weight from kg to inches 
	
		if(inches <= fiveFeet)
		{
			if(gender.equals("M")
			{
			idealBodyWeight = 50;
			}
			
		else{
			idealBodyWeight =45.5;
			}
		}
		
		else{
			if(gender.equals("M"))
			{
			idealBodyWeight = 50 +((inches-fiveFeet) *2.3);
			}
			
			else
			{
			idealBodyWeight = 45.5+ ((inches-fiveFeet) * 2.3);
			}
		}
		
		return ( (idealBodyWeight <=(weight+ 2.0))
				&&(idealBodyWeight >= (weight -2.0))
				);
	}
	*/
	
	public double getStartingHeight() 
	{
		return startingHeight;
	}
	
	public double getStartingWeight()
	{
		return startingWeight;
	}

	public void setStartingHeight(double startingHeight) 
	{
		this.startingHeight = startingHeight;
	}

	public void setStartingWeight(double startingWeight) 
	{
		this.startingWeight = startingWeight;
	}

	public String toString()
    {
        return "Email Address: " + getEmail()
             + ", Name: " + getName()
             + ", Address: " + getAddress()
             + ", Gender: " + getGender()
      	 	 + ", Height: " + getStartingHeight()
      	 	 + ", Weight: " + getStartingWeight();
    }
	

	
}



