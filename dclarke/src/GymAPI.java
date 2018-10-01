/**
 * @author DarrenClarke
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GymAPI {
	
    private Scanner sc = new Scanner(System.in);
	private ArrayList<Member> members;
	private ArrayList<Trainer> trainers;
	
    public GymAPI()
    {
    	sc = new Scanner(System.in); 
    	members = new ArrayList<Member>();
        trainers = new ArrayList<Trainer>();
    }
    
    //members getter
	public ArrayList<Member> getMembers() 
	{
		return members;
	}
	
	//trainers getter
	public ArrayList<Trainer> getTrainers() 
	{
		return trainers;
	}
	
	
	public void addMember(Member member) 
	{
		members.add(member);
	}
	
	
	public void addTrainer(Trainer trainer) 
	{
		trainers.add(trainer);
	}
    
    //returns number of members
	public int numberOfMembers() {
		int numberofMembers = members.size();
		return numberofMembers;
	}
	
	
	public int numberOfTrainers() {
		int numberofTrainers =trainers.size();
		return numberofTrainers;
	}
	
	public boolean isValidMemberIndex(int index)
	{
		return false;
		
	}
	
	public boolean isValidTrainerIndex(int index)
	{
		return false;
		
	}
	
	public Member searchMemberByEmail(String emailEntered)
	{
		return null;	
	}
		
	
	
	public Person searchTrainersByEmail(String emailEntered)
	{
		return null;
		
	}
	
	//list members out to the user
	public String listMembers(){
		if (members.size() == 0){
			return "No Members";
		}
		else{
			String listOfMembers = "";
			int index = 0;
			for (Member member : members){
				listOfMembers = listOfMembers + index + ": " + member + "\n";
				index ++;
			}
			return listOfMembers;
		} 
	}
	
	//list trainers out to the user
	public String listTrainers(){
		if (trainers.size() == 0){
			return "No Trainers";
		}
		else{
			String listOfTrainers = "";
			int index = 0;
			for (Trainer trainer : trainers){
				listOfTrainers = listOfTrainers + index + ": " + trainers + "\n";
				index ++;
			}
			return listOfTrainers;
		} 
	}
	
	//change a members details
	public void editMember()
	{
		   
		   System.out.println(listMembers());
		   
		   if(getMembers().size() !=0){
		   System.out.print("Index of Member to edit ==>");
		   int index = sc.nextInt();
		   
		   if(index < getMembers().size()){

		   System.out.print("Enter New Name: ");
		   String name = sc.nextLine();
		   System.out.print("Enter New Email: ");
		   String email = sc.nextLine();
		   System.out.print("Enter New Address: ");
		   String address = sc.nextLine();
		   System.out.print("Enter New Gender: ");
		   String gender = sc.nextLine();
		   System.out.print("Enter New Weight: ");
		   double weight = sc.nextDouble();
		   System.out.print("Enter New Height: ");
		   double height = sc.nextDouble();

		   Member member = getMembers().get(index);
		   member.setName(name);
		   member.setEmail(email);
		   member.setAddress(address);
		   member.setGender(gender);
		   member.setStartingWeight(weight);
		   member.setStartingHeight(height);
		   }
		   
		   else{
			   System.out.println("No Member for this Index");
		   }
		   }
	   }
	
	//check members email against members array list and give out the details for that member
	public void viewProfile()
	{
		System.out.println("please enter your email;");
		String emailEntered =sc.nextLine();
		Member memberx;
		
		for (int x =0; x < members.size()-1; x++)
		{
			Member members = getMembers().get(x);
			
			if (emailEntered.equals(members.getEmail()))
				{
				  memberx = getMembers().get(x);
				  String name = memberx.getName();
				  String email = memberx.getEmail();
				  String address = memberx.getAddress();
				  String gender = memberx.getGender();
				  double weight = memberx.getStartingWeight();
				  double height = memberx.getStartingHeight();
				System.out.println("Name: " +name + "\n" + "Email: " + email + "\n" +
				  "Address: " + address + "\n" + "Gender: " + gender + "\n" + "Starting Weight: " +
						weight + "Starting Height: " + height);
				}
			else
				{
				System.out.println("No trainer for this email address");
				}
		}
	}




	
	
	public String listMembersBySpecificBMICategory(String category)
	{
		return category;
		
	}
	
	public String listMemberDetailsImperialAndMetric()
	{
		return null;
		
	}
	
}
