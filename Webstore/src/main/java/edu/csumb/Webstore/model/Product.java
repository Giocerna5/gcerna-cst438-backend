//This is your model. This file should only contain getters and setters, along with the variables your struct uses.
//DONT FORGET THE CONSTRUCTOR! Getters and setters must be setup to match the name exactly
//or else you will have many errors.
package edu.csumb.Webstore.model;

public class Product
{
	private String name = "";
	private long id = -1;
	private String description = "null";
	private String imageURL = "null";
	private Double price = 0.00;
	private Integer stock = 0;

	public Product(String name, long id, String description, String imageURL, Double price, Integer stock){
		this.name = name;
		this.id = id;
		this.description = description;
		this.imageURL = imageURL;
		this.price = price;
		this.stock = stock;
	}

	public String getName(){ return this.name; }
	public void setName(String temp){ this.name = temp; }
 	public long getID(){ return this.id; } 
	public void setID(long temp){ this.id = temp; }  
 	public String getDescription(){ return this.description; } 
	public void setDescription(String temp){ this.description = temp; }  
 	public String getImageURL(){ return this.imageURL; }   
	public void setImageURL(String temp){ this.imageURL = temp; }  
 	public Double getPrice(){ return this.price; } 
	public void setPrice(Double temp){ this.price = temp; }  
 	public Integer getStock(){ return this.stock; }
	public void setStock(Integer temp){ this.stock = temp; }  
}
