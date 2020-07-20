package com.deloitte.beam.schema;

import org.apache.beam.sdk.schemas.JavaBeanSchema;
import org.apache.beam.sdk.schemas.annotations.DefaultSchema;

@DefaultSchema(JavaBeanSchema.class)
public class TransactionPojo {

	private String bank;
	private double purchaseAmount;
	
	public TransactionPojo() {
		this.bank = "dummy";
		this.purchaseAmount=0d;
	}
	
	public TransactionPojo(String bank, double purchaseAmount) {
		super();
		this.bank = bank;
		this.purchaseAmount = purchaseAmount;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	
	@Override
	public String toString() {
		return "Bank:"+getBank() +" purchaseAmount:"+getPurchaseAmount();
	}
}
