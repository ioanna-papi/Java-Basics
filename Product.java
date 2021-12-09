package Ergasia;

public class Product {

private static int count;
private int id1 ;
private String description ;
private double price ;

public Product( String description, double price) {
	
	this.id1 = ++ count; 
	this.description = description;
	this.price = price ;
	
}
	
	
@Override
public String toString() {
	return " [Product's id is:" + id1 + ",the product that customer prefers is: "+ description +", this product costs:" + price+ "]" ;
}
