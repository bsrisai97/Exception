package com.practice;

public class Encapsulations 
{
	private long accno;
	private String name;
	private float amount;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Encapsulation [accno=" + accno + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
}
