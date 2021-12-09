package Ergasia;

import java.util.ArrayList ;


public class Shop {

	private  int id2;
	private static int count ;
	private String brand ;
	private String saddress;
	private int number ;

	public static ArrayList <Shop> shops = new ArrayList <Shop>() ;
	public static ArrayList <Product> pr = new ArrayList <Product>() ;


	public Shop ( String brand, String saddress, int number) {
		this.brand = brand ;
		this.saddress = saddress ;
		this.id2 = ++count;
		this.number = number;
		shops.add(this) ;
	}

	public String getBrand() {
		return brand ;
	}

	public void setBrand(String brand) {
		this.brand = brand ;
	}


	public static void printAllShops() {
		int i = 1;
		for (Shop s : Shop.shops) {
			System.out.println("Shop number "+ i +" is "+ s.getBrand());
			++i ;
		}
	}
	public static void filterAndPrintShops(String str) {

		int i = 1;
		System.out.println("The shop that you're looking for is possibly one of them:");
		for (Shop s1 : Shop.shops) {

			if ((s1.getBrand().toLowerCase()).contains(str.toLowerCase())) {
				//  s1.setBrand(s1.getBrand().toUpperCase());
				System.out.println("Shop number "+i+" is "+s1.getBrand().toUpperCase());
				++i;
			}
		}
	}

	public static void noFilter(String str) {
		int i = 1;
		System.out.println("The shop that you're looking for is possibly one of them:");
		for (Shop s1 : Shop.shops) {

			if ((s1.getBrand().toLowerCase()).contains(str.toLowerCase())) {
				System.out.println("Shop number "+i+" is "+s1.getBrand());
				++i;
			}

		}
	}



}
