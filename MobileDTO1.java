package com.xworkz.java.CRUDOperation;

public class MobileDTO1 {

	private String BrandName;
	private String Color;
	private String modelName;
	private float price;
	private byte ram;
	private float ratings;
	private int storage;

	public MobileDTO1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MobileDTO1 [BrandName=" + BrandName + ", Color=" + Color + ", modelName=" + modelName + ", price="
				+ price + ", ram=" + ram + ", ratings=" + ratings + ", storage=" + storage + "]";
	}


	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

}
