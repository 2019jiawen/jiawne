package com.kgc.vehicle;
//汽车类
public abstract class MotoVehicle {
	//车牌号  品牌  日租金
	private  String vhicleId;
	private  String brand;
	private  int preRent;
	public MotoVehicle(){
		
	}
	
	public MotoVehicle(String vhicleId, String brand, int preRent) {
		this.vhicleId = vhicleId;
		this.brand = brand;
		this.preRent = preRent;
	}

	public String getVhicleId() {
		return vhicleId;
	}
	public void setVhicleId(String vhicleId) {
		this.vhicleId = vhicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPreRent() {
		return preRent;
	}
	public void setPreRent(int preRent) {
		this.preRent = preRent;
	}
	
	public abstract double ca(int days);
	//计算租金
}
