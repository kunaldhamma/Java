package com.kunzen.designpattern.java;

public class Builder {

	//required parameters
	private String ram;
	private String hdd;

	//optional parameters
	private boolean isGraphicCardsEnabled; 
	private boolean isBluetoothEnabled;
	
	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGraphicCardsEnabled() {
		return isGraphicCardsEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Builder(ComputerBuilder computerBuilder) {
		super();
		this.ram = computerBuilder.ram;
		this.hdd = computerBuilder.hdd;
		this.isGraphicCardsEnabled = computerBuilder.isGraphicCardsEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		//required parameters
		private String ram;
		private String hdd;
		
		//optional parameters
		private boolean isGraphicCardsEnabled; 
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String ram, String hdd){
			this.ram=ram;
			this.hdd=hdd;
		}
		
		public ComputerBuilder setGraphicsCardEnable(boolean graphicsEnabled){
			this.isGraphicCardsEnabled=graphicsEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean blueToothEnabled){
			this.isBluetoothEnabled=blueToothEnabled;
			return this;
		}
		
		public Builder build(){
			return new Builder(this);
		}
	}
	
	public static void main(String[] args) {
		Builder builder = new Builder.ComputerBuilder("3gb","600gb").setBluetoothEnabled(true).setGraphicsCardEnable(true).build();
		System.out.println(builder);
		
		Builder builder1 = new Builder.ComputerBuilder("3gb","600gb").build();
		System.out.println(builder1);
	}

	@Override
	public String toString() {
		return "Builder [ram=" + ram + ", hdd=" + hdd + ", isGraphicCardsEnabled=" + isGraphicCardsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
