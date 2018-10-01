/**
 * @author DarrenClarke
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    private Scanner sc = new Scanner(System.in);
    private GymAPI gymapi;
    private Member member;
    private ArrayList <Member> members;
    private ArrayList <Trainer> trainers;
  
 
    public Driver()
    {
        sc = new Scanner(System.in);        
        gymapi = new GymAPI();
        runMenu();
    }
    
    
    public static void main(String[] args) 
    {
        Driver app = new Driver();
    }
    
    //displays main menu
    private int mainMenu()
    { 
        System.out.println("Gym Menu");
        System.out.println("- Please Log in or Register -");     
        System.out.println("  1) Login");    
        System.out.println("  2) Register");    
        System.out.println("---------");         
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }

    //runs the menu to allow log in and register
    private void runMenu()
    {
        int option = mainMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    runLoginMenu();
            	          break;
               case 2:    runRegisterMenu();
                          break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            sc.nextLine();        
            option = mainMenu();
        }
       
       //if 0 picked exit app
        System.out.println("Exiting...");
        System.exit(0);
    }
    
    //checks if registering member or trainer
    private int registerMenu()
    { 
        System.out.println("Registration Menu");
        System.out.println("- Register New Member or Trainer? -");     
        System.out.println("  1) Member");    
        System.out.println("  2) Trainer");    
        System.out.println("---------");         
        System.out.println("  0) Main Menu");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }
    
    private void runRegisterMenu()
    {
        int option = registerMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    runStudentPremium();
            	          break;
               case 2:    addTrainer();
               			  runTrainerMenu();
                          break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            
            
            option = registerMenu();
        }
       
        //if 0 picked returns to main menu
        System.out.println("returning to main menu...");
        runMenu();
    }
 
    private int loginMenu()
    { 
        System.out.println("Login Menu");
        System.out.println("- Log in as Member or Trainer -");     
        System.out.println("  1)Log in as Member");    
        System.out.println("  2)Log in as Trainer");    
        System.out.println("---------");         
        System.out.println("  0) Main Menu");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }
    
    private void runLoginMenu()
    {
        int option = loginMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    memberLogin();
            	          break;
               case 2:    trainerLogin();
                          break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            
            
            option = loginMenu();
        }
       
        System.out.println("returning to main menu...");
        runMenu();
    }
    
    //checks if member is student or premium and runs the correct add function
    private int studentPremiumMenu()
    { 
        System.out.println("Registration Menu");
        System.out.println("- Register as Student Member or Premium Member? -");     
        System.out.println("  1)Register as Student Member");    
        System.out.println("  2)Register as Premium Member");    
        System.out.println("---------");         
        System.out.println("  0) Main Menu");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }
    
    private void runStudentPremium()
    {
        int option = studentPremiumMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    addStudentMember();
               			  runMemberMenu();
            	          break;
               case 2:    addPremiumMember();
               			  runMemberMenu();
                          break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            option = studentPremiumMenu();
        }
       
        //if option 0 is picked exit game
        System.out.println("returning to main menu...");
        runMenu();
    }
    
    
    private int trainerMenu()
    { 
        System.out.println("Trainer Menu");
        System.out.println("- Please Select an Option -");     
        System.out.println("  1) Add Student Member");    
        System.out.println("  2) Add Premium Member");
        System.out.println("  3) List all Members");
        System.out.println("  4) List Members with Ideal Bodyweight");
        System.out.println("  5) List Members with a Specific BMI Category");
        System.out.println("  6) Search Members by Email");
        System.out.println("  7) Add an Assesment for a Member");
        System.out.println("  8) View Assessments for a Member");
        System.out.println("---------");         
        System.out.println("  0) Log Out");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }
    //displays trainer menu
    private void runTrainerMenu()
    {
        int option = trainerMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    addStudentMember();
            	          break;
               case 2:    addPremiumMember();
                          break;
               case 3:    System.out.println(gymapi.listMembers());
               			  break;
               case 4:    checkBMI();
               			  break;
               case 5:    System.out.println("List Members with a Specific BMI Category");
               			  break;
               case 6:    System.out.println("Search Members by Email");
               			  break;
               case 7:    System.out.println("Add an Assesment for a Member");
    			  		  break;
               case 8:    System.out.println("View Assessments for a Member");
    			  		  break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            sc.nextLine();   
            option = trainerMenu();
        }
        System.out.println("returning to main menu...");
        runMenu();
    }
    //displays member menu
    private int memberMenu()
    { 
        System.out.println("Member Menu");
        System.out.println("- Please Select an Option -");     
        System.out.println("  1) View Profile");    
        System.out.println("  2) Update Profile");
        System.out.println("  3) View Progress");
        System.out.println("---------");         
        System.out.println("  0) Log Out");
        System.out.print("==>> ");
        int option = sc.nextInt();
        return option;
    }
    
    private void runMemberMenu()
    {
        int option = memberMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    gymapi.viewProfile();
            	          break;
               case 2:    gymapi.editMember();
                          break;
               case 3:    System.out.println("View Progress");
               			  break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            
            System.out.println("\nPress any key to continue...");
            sc.nextLine();
            sc.nextLine();   
            option = memberMenu();
        }
        System.out.println("returning to main menu...");
        runMenu();
    }
    //add trainer to trainers array list
    public void addTrainer()
    {
    	sc.nextLine();
        System.out.println("Full Name: ");
        String fullName = sc.nextLine();
        System.out.println("Email Address: ");
        String email = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Speciality: ");
        String speciality = sc.nextLine();
        System.out.println("Trainer Account Set Up!");
        gymapi.addTrainer(new Trainer(fullName,  email, address, gender, speciality));
    }
    
    //adds student member to members array list
	public void addStudentMember()
	{
        //Enter the user details:
		System.out.println("");
		sc.nextLine();
        System.out.println("Full name: ");
        String name = sc.nextLine();
        System.out.println("Email Address: ");
        String email = sc.nextLine();
        System.out.println("Home Address: ");
        String address = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Name of College:");
        String collegeName = sc.nextLine();
        System.out.println("StudentID: ");
        String studentid = sc.nextLine();
        System.out.println("Height (meters): ");
        double height = sc.nextDouble();
        System.out.println("Weight (Kg): ");
        double startingWeight = sc.nextDouble();
        System.out.println("Student Member Added!");
        System.out.println("");
        gymapi.addMember(new StudentMember(name, email, address, gender, collegeName, studentid, height, startingWeight));        
    }
	
	//adds premium member to members array list
	public void addPremiumMember()
	{
		System.out.println("");
		sc.nextLine();
        System.out.println("Full name: ");
        String name = sc.nextLine();
        System.out.println("Email Address: ");
        String email = sc.nextLine();
        System.out.println("Home Address: ");
        String address = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Height (Meters): ");
        double height = sc.nextDouble();
        System.out.println("Weight (Kg): ");
        double startingWeight = sc.nextDouble();
        System.out.println("Premium Member Added!");
        System.out.println("");
        gymapi.addMember(new PremiumMember(name, email, address, gender, height, startingWeight));        
    }
    
	public void checkBMI()
	{
		System.out.println("");
		sc.nextLine();
        System.out.println("Please enter Weight: ");
        double weight = sc.nextDouble();
        double bmi = member.calculateBMI(weight);
        member.determineBmiCategory(bmi);
	}
	
	//non working, checks email entered vs all member emails
	 public Member memberLogin()
		{
			System.out.println("Please enter your email: ");
			String emailEntered = sc.nextLine();
			Member memberx = null;
			for (int x =0; x < members.size()-1; x++)
			{
				Member members = gymapi.getMembers().get(x);
				if (emailEntered.equals(members.getEmail()))
					{
					memberx = gymapi.getMembers().get(x);
					}
				else
					{
					
					System.out.println("No Member for this email address");
						memberx = null;
					}
			}
			 return memberx;
		}
		
		public Trainer trainerLogin()
		{
			sc.nextLine();
			System.out.println("Please enter your email: ");
			String emailEntered = sc.nextLine();
			Trainer trainerx = null;
			for (int x =0; x < trainers.size()-1; x++)
			{
				Trainer trainers = gymapi.getTrainers().get(x);
				if (emailEntered.equals(trainers.getEmail()))
					{
					trainerx = gymapi.getTrainers().get(x);
					}
				else
					{
					
					System.out.println("No trainer for this email address");
						trainerx = null;
					}
			}
			 return trainerx;
		}
}