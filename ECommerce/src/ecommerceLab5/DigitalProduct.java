package ecommerceLab5;
/**
 * File name: DigitalProduct.java
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
public class DigitalProduct extends Product {
	/**
	 * This class is the digital product class of the e-commerce platform. 
	 * This class extends the abstract Product class 
	 * and has been modified to include new attributes fileSize and downloadLink.
	 * @see ecommerceLab5.Product
	 * @author kira
	 * @verson 1.0
	 * @since 17.0.11
	 */
	
	/**
	 * The file size of the digital product 
	 */
	public double fileSize;
	/**
	 * The download link that is needed to download the digital product 
	 */
	public String downloadLink;
	
	/**
	 * Constructor for the digital product with all attributes, 
	 * some come from the super class product  and two new ones from this class fileSize and downloadLink
	 * @param name the name of the product
	 * @param price the price of the product 
	 * @param category the category of the product
	 * @param fileSize the file size of the product 
	 * @param downloadLink the download link for the product 
	 */
	public DigitalProduct(String name, double price, String category, double fileSize, String downloadLink) {
		super(name,price,category);
		this.fileSize = fileSize;
		this.downloadLink = downloadLink;
	}
/**
 * Gets the fileSize of the product
 * @return the fileSize of the product 
 */
	public double getFileSize() {
		return fileSize;
	}
/**
 * Sets the fileSize of the product
 * @param fileSize the fileSize of the digital product 
 */
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
/**
 * Gets the downloadLink for the digital product 
 * @return the downloadLink of the product 
 */
	public String getDownloadLink() {
		return downloadLink;
	}
/**
 * Sets the downloadLink of the digital product
 * @param downloadLink for the digital product 
 */
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
/**
 * This is the to sting method it has be formated using String.formt 
 * this is to make each attribute and its description appear on a different line it is a overridden method from the 
 * abstract class product it's be overridden to print the two attributes that have been added 
 * @return String a string of the product details 
 */
	@Override
	public String toString() {
		return String.format("Digital Product Details:\nProduct Name: %s\nPrice: $%.2f\nCategory: %s\nFile Size: %s gb\nDownload Link %s",  
				getName(), getPrice(), getCategory(), getFileSize(), getDownloadLink()); 
	}
	
	/**
	 * purchaseProdcut is a overridden method from the abstract class product it has been overridden to include a message 
	 * for the physical product that says it will be shipped soon this message is only for digital products. 
	 * @return String a string message for digital products 
	 */
	@Override
	public String purchaseProduct() {
		String message = "Your Digital product is ready for download.";
		return message;
	}
}
