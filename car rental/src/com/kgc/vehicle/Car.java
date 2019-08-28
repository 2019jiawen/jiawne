package com.kgc.vehicle;
//½Î³µÀà
public class Car extends MotoVehicle {
//ÐÍºÅ
	private  String type;
	public Car(){}
	
	public Car( String vhicleId, String brand, int preRentint ,String type) {
		super( vhicleId,  brand, preRentint);
		this.type = type;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double ca(int days) {
		double price = this.getPreRent()*days;
		if(days >7 &&days<=30){
			price *= 0.9;
		}else if (days >30 &&days<=150){
			price *= 0.8;
		}else if (days >150){
			price *= 0.7;
		}
		return price;
	}

}
