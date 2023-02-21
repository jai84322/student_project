package com.student.entities;

public class College {
	
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	
	
//	public College(int totalMoneyEarned, int totalMoneySpent) {
//		this.totalMoneyEarned = totalMoneyEarned;
//		this.totalMoneySpent = totalMoneySpent;
//	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned += totalMoneyEarned;
	}
	
	public void setRemainingMoney(int remainingMoney) {
		this.totalMoneyEarned = remainingMoney;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent += totalMoneySpent;
	}
	
}
