package Ergasia;

import java.util.Scanner;
import java.util.InputMismatchException;


public class RegisteredCustomer extends Customer {

	private static int count ;
	private   int id ;
	private String email;
	private String passwd ;




	public RegisteredCustomer (String name, int custnumber, String address, String email, String passwd) {
		super(name, custnumber, address);
		this.email=email;
		this.passwd=passwd;
		count ++ ;
		this.id = count;
	}

	public String getEmail() {
		return email ;
	}

	public void setEmail( String email) {
		this.email=email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd=passwd ;
	}

	@Override
	public  void getMenu() {
		Scanner sc = new Scanner(System.in);
		try {


			System.out.println("Press 1 to see all the stores");
			System.out.println("Press 2 if you have a particular preference");
			System.out.println("Press enter key if you want to see shop's name without filter ");

			String ans = sc.nextLine() ;

			if (ans.equals("1") ) {

				Shop.printAllShops();
			}
			if (ans.equals("2") )	{
				System.out.println("Give us a clue about what are you looking for");
				String clue = sc.nextLine()	;
				if(clue.equals("") ) {
					
					Shop.noFilter(clue);
				}
				else{
					Shop.filterAndPrintShops(clue) ;
				}
			}
			getMenu() ;
		}
		catch(InputMismatchException ex) {
			System.out.println("Something went wrong!");
		}
	}






	public static RegisteredCustomer login(String email ,String passwd ) {

		for(Customer c : Customer.cust) {
			if (c instanceof RegisteredCustomer) {
				RegisteredCustomer c1 = (RegisteredCustomer)c ;
				if( (c1.getEmail().equals (email)) && (c1.getPasswd().equals( passwd ))){
					c1 = (RegisteredCustomer)c ;
					return c1 ;
				}
			}
		}
		return null ;
	}

}

