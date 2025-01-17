package ecommerceLab5;
/**
 * File name: Product.java
 * Author: Kira Evans
 * Date: November 4th 2024
 * Purpose: This program emulates a e-commerce platform it contains an abstract class 
 * and two classes physical product and digital product. The methods in the concrete classes are 
 * overridden to display messages unique to the product purchased. 
 * Class list: Product, PhysicalProduct, DigitalProduct, TestECommerce
*/
public abstract class Product {
	/**
	 * This class is the abstract class for the ecommerce project is has a constructor with a name price and category all products will have these attributes 
	 * it also has two abstract methods one is a toSting that will return a string of details for the products and a purchase message string that will return a message for the product
	 * @author kira
	 * @verson 1.0
	 * @since 17.0.11
	 */
	
	/**
	 * the name of the product 
	 */
	String name;
	/**
	 * the price of the product 
	 */
	double price;
	/**
	 * the category of the product 
	 */
	String category;
	
	/**
	 * This is the constructor for the product class it has all the attributes 
	 * @param name the name of the product 
	 * @param price the price of the product 
	 * @param category the category the product is in
	 */
	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	/**
	 * Gets the name of the product 
	 * @return the name of the product 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the product
	 * @param name of the product 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Gets the price of the product 
	 * @return the price of the product 
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the price of the product 
	 * @param price the pice of the product 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Gets the category the product is in
	 * @return the category of the product 
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * Sets the category of the product 
	 * @param category the category the product is in
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/** 
	 * Provides a string representation of the product. 
	 * This method must be implemented by subclasses to provide specific details. 
	 * @return a string representing the product 
	 */
	public abstract String toString();
	/** 
	 * Abstract method to handle the purchase process of the product. 
	 * Subclasses must provide the implementation. 
	 * @return a message confirming the purchase 
	 */
	public abstract String purchaseProduct();
}


