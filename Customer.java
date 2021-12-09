package Ergasia ;

import java.util.ArrayList ;


public abstract class Customer {
	
private String name ;
private int custnumber ;
private String address ;
public static ArrayList <Customer> cust = new ArrayList <Customer>() ;



public Customer (String name, int custnumber, String address) {
	
	this.name=name;
	this.custnumber=custnumber;
	this.address=address;
	cust.add(this) ;
}
	
public abstract  void getMenu()	;
	

	public String getName() {
		return name ;
	}
	
	
	public int getCustnumber() {
		 return custnumber ;
	}
	
	public String getAddress() {
		   return address ;
	}
	
	
}
