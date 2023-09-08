package com.example.JewelleryProductDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jewelleryproduct {

	@Id
	private String productname;
	private String producturl;
	private String productdescription;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducturl() {
		return producturl;
	}
	public void setProducturl(String producturl) {
		this.producturl = producturl;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

}
