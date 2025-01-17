package ecommerceLab5;
/**
 * File name: TestECommerce
 * Author: Kira Evans 
 * Date: November 4th 2024
 * Purpose: This program emulates a e-commerce platform it contains an abstract class 
 * and two classes physical product and digital product. The methods in the concrete classes are 
 * overridden to display messages unique to the product purchased. 
 * Class list: Product, PhysicalProduct, DigitalProduct, TestECommerce
*/
public class TestECommerce {
	/**
	 * The class TestECommerce is only job is to print the methods from the other classes 
	 * @see ecommerceLab5.PhysicalProduct.java
	 * @see ecommerceLab5.DigitalProduct.java
	 * @author kira
	 * @version 1.0
	 * @since 17.0.11
	 */
	/**
	 * This is the main method to run the program
	 * @param args the args param
	 */
	public static void main (String[] args) {
		PhysicalProduct productPhysical = new PhysicalProduct("Lion Brand 100% Wool", 9.99, "Yarn", 85, 5);
		DigitalProduct productDigital = new DigitalProduct("Pokemon Scarlet & Violet DLC", 44.99, "Video game add on", 10, "www.nintendo/downloads/pokemon_scarlet_violet.com");
		System.out.println(productPhysical.toString());
		System.out.println(productPhysical.purchaseProduct());
		System.out.println();
		System.out.println(productDigital.toString());
		System.out.println(productDigital.purchaseProduct());
	}
}
