package com.xworkz.bakery.dto;

public class PastryDTO {
	private String flavor;
	private int price;
	private int quantity;
	
	public PastryDTO() {
		
	}

	public PastryDTO(String flavor, int price, int quantity) {
		super();
		this.flavor = flavor;
		this.price = price;
		this.quantity = quantity;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals methods invoked");
		if (obj == null)
			return false;
		if (obj instanceof PastryDTO) {
			PastryDTO casted = (PastryDTO) obj;
			if (this.getFlavor() != null && this.flavor.equals(casted.getFlavor())) {

				System.out.println("flavor" + this.flavor);
				return true;

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PastryDTO [flavor=" + flavor + ", price=" + price + ", quantity=" + quantity + ", getFlavor()="
				+ getFlavor() + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
