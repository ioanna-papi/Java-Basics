package Ergasia;
import java.util.Scanner ;
import java.util.InputMismatchException ;
public class TestProgram {
	
	
	
	public static void main(String[] args) {
		loadObjects() ;
		while(true) {
		
		try {
			printMenu();
			
		}
			catch(InputMismatchException ex) {
				System.out.println();
			}
		}
	}
	
	
	
	private static void printMenu() throws InputMismatchException{
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Press 1 to sign up") ;
		System.out.println("Press 2 to login")  ;
		System.out.println("Press 3 to continue as a guest") ;
		String ans = sc.nextLine() ;
		//int choice = Integer.parseInt(ans);
		switch (ans) {
		
		    case "1" :
			signUp() ;
			break;
		   
		    case "2" :
		    registration() ;
		    break ;
		    
		    case "3" :
		    VisitorCustomer v1 = new VisitorCustomer (null,0,null);
		    v1.getMenu();
		    break;
		}
		
		
		
		}
		
		
		private  static void signUp() {
			
			Scanner s= new Scanner(System.in);
			try {
			System.out.println("Please fill the following fields");
			System.out.print("Name:");
			String  name = s.nextLine() ;
			System.out.print("Number:");
			String num1 = s.nextLine();
			int num = Integer.parseInt(num1);
			System.out.print("Address:");
			String address = s.nextLine();
			System.out.print("E-mail account:");
			String em = s.nextLine() ;
			System.out.print("Enter your password:");
			String passwd = s.nextLine();
			new RegisteredCustomer(name, num, address, em, passwd);
			printMenu() ;
		}
		
		    catch (InputMismatchException ex) {
		    	System.out.println("Something went wrong!");
		    }
		}
		
		
		private static void registration() {
		Scanner s2 = new Scanner(System.in) ;
		try {
		System.out.print("Enter your e-mail:");
		String e2 = s2.nextLine()	 ;
		System.out.print("Enter your password:");
		String p2 = s2.nextLine()	;
		
		RegisteredCustomer user = null ;
		if( (user = RegisteredCustomer.login(e2,p2))== null   ) {
			
			System.out.println("This account doesn't exist.Try again");
			System.out.println("Press enter to return to the link menu");
			s2.nextLine();
			registration() ;
		}else {
			System.out.println("Welcome " + RegisteredCustomer.login(e2,p2).getName()) ;
			user.getMenu() ;
			
		}
		}
			catch (InputMismatchException ex) {
		 System.out.println("Something went wrong!");
			}
			
			
		}
		
		
		
		
		private static void loadObjects() {
			Customer reg = new RegisteredCustomer("Joanna",1234567, "12 g.l.", "tade@mail.com", "56789sd");
			Customer vis = new VisitorCustomer("Manos", 2842, "34 g i");
			Customer reg2 = new RegisteredCustomer("1",1, "1", "1", "1");
			Shop new_shop = new Shop("zara", "56 patisiwn", 1029384756);
			Shop shop2 = new Shop("h&m3", "78 oktob", 98767890);
					

		}
		
		
		
		
		
	}
			
			
			

