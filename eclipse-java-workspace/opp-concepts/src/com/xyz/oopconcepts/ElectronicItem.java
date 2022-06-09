package com.xyz.oopconcepts;

public class ElectronicItem extends Item {

	private float inputVoltage;

	public ElectronicItem() {
		super();
	}

	public ElectronicItem(int id, String itemName, float price, float inputVoltage) {
		super(id, itemName, price);
		this.inputVoltage = inputVoltage;
	}

	public float getInputVoltage() {
		return inputVoltage;
	}

	public void setInputVoltage(float inputVoltage) {
		this.inputVoltage = inputVoltage;
	}

	public void plugIn() {
		System.out.println(this.getItemName() + " plugged in");
	}

	public void switchOn() {
		System.out.println(this.getItemName() + " switched on");
	}

	
	public void showItemDetails() {

		System.out.println(super.toString());
		System.out.println("Input Voltage : " + inputVoltage);

	}

	@Override
	public String toString() {
		return super.toString() + " - ElectronicItem [inputVoltage=" + inputVoltage + "]";
	}

}
