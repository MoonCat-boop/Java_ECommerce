package ecommerceLab5;
/**
 * File name: PhysicalProduct.java
 * Author: Kira Evans 041155915
 * Course: CST8284 - OOP 
 * Assignment: Lab 5
 * Date: November 4th 2024
 * Professor: Sandra Iroakazi 
 * Purpose: This program emulates a e-commerce platform it contains an abstract class 
 * and two classes physical product and digital product. The methods in the concrete classes are 
 * overridden to display messages unique to the product purchased. 
 * Class list: Product, PhysicalProduct, DigitalProduct, TestECommerce
*/
public class PhysicalProduct extends Product{
/**
 * This class is the physical product class of the e-commerce platform. 
 * This class extends the abstract Product class 
 * and has been modified to include new attributes weight and shipping cost.
 * @see ecommerceLab5.Product
 * @author kira
 * @verson 1.0
 * @since 17.0.11
 */
	
	/** 
	 * Weight of the physical product in grams.
	 */	
	public double weight;
	
	/** 
	 * Shipping cost for the physical product. 
	 */
	public double shippingCost;
	
	/**
	 * Constructor for the physical product with all attributes, 
	 * some come from the super class and two new ones from this class weight and shipping cost 
	 * @param name the name of the product 
	 * @param price the price of the product 
	 * @param category the category of the product 
	 * @param weight the weight of the product in grams 
	 * @param shippingCost the shipping cost of the product
	 */
	public PhysicalProduct(String name, double price, String category, double weight, double shippingCost) {
		super(name,price,category);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}
	/** 
	 * Gets the weight of the product. 
	 * @return the weight of the product 
	 */
	public double getWeight() {
		return weight;
	}
	/** 
	 * Sets the weight of the product. 
	 * @param weight the new weight of the product 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * Gets the shipping cost of the product. 
	 * @return the shipping cost of the product 
	 */
	public double getShippingCost() {
		return shippingCost;
	}
	/** 
	 * Sets the shipping cost of the product. 
	 * @param shippingCost the new shipping cost of the product 
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	/**
	 * This is the to sting method it has be formated using String.formt 
	 * this is to make each attribute and its description appear on a different line it is a overridden method from the 
	 * abstract class product it's be overridden to print the two attributes that have been added 
	 * @return String a string of the product details 
	 */
	@Override
	public String toString() {
	    return String.format("Physical Product Details:\nProduct Name: %s\nPrice: $%.2f\nCategory: %s\nWeight: %.2f g\nShipping Cost: $%.2f",
	        getName(), getPrice(), getCategory(), getWeight(), getShippingCost());
	}
	
	/**
	 * purchaseProdcut is a overridden method from the abstract class product it has been overridden to include a message 
	 * for the physical product that says it will be shipped soon this message is only for physical products. 
	 * @return String a string message for physical products 
	 */
	@Override
	public String purchaseProduct() {
		String message = "Your Physical product is going to be shipped soon.";
		return message; 
	}
}
