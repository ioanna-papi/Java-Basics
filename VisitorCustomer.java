package Ergasia;

public class VisitorCustomer extends Customer {

	public VisitorCustomer(String name, int number, String address) {
		super(name, number, address);
	}
	
	@Override
	public  void getMenu() {
		
		Shop.printAllShops();	
	}
	
	}