package com.kgc.vehicle;
//客车类
public class Bus extends MotoVehicle {
//座位数
	private  int seatCount;
	public Bus(){}
	
	public Bus( String vhicleId, String brand, int preRentint ,int seatCount) {
		super( vhicleId,  brand, preRentint);
		this.seatCount = seatCount;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public double ca(int days) {
		double price = this.getPreRent()*days;
		if(days >=3 &&days<7){
			price *= 0.9;
		}else if (days >=7 &&days<30){
			price *= 0.8;
		}else if (days >=30 &&days<150){
			price *= 0.7;
		}else if (days >=150){
			price *= 0.6;
		}
		return price;
	}

}
