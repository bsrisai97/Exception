package com.practice;

public class TestEncapsulation 
{
	public static void main(String[] args) 
	{
		
		Encapsulations acc=new Encapsulations();
		acc.setAccno(2345);
		acc.setName("SriSai");
		acc.setAmount(100000);
		System.out.println(acc.getAccno() +" "+ acc.getName() +" "+ acc.getAmount());
	}
}
