package com.student.entities;

public class College {
	
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	
	
//	public College(int totalMoneyEarned, int totalMoneySpent) {
//		this.totalMoneyEarned = totalMoneyEarned;
//		this.totalMoneySpent = totalMoneySpent;
//	}
	
	public int getTotalMoneyEarned() {
		System.out.println("total money earned: " + totalMoneyEarned);
		return totalMoneyEarned;
		
	}
	public void setTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
		System.out.println("money earned: " + MoneyEarned); // working
		System.out.println("total money in account: " + totalMoneyEarned);
	}
	
	public void setRemainingMoney(int remainingMoney) {
		this.totalMoneyEarned = remainingMoney;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public void setTotalMoneySpent(int MoneySpent) {
		totalMoneySpent += MoneySpent;
		System.out.println("money spent: " + MoneySpent); // working
		System.out.println("total money spent: " + totalMoneySpent);
	}
	
}
