package com.bms.model;

public interface RBI {
	public Account createAccount(Account a);
	public Account retrieveAccount(int accNo);
	public boolean deleteAccount(int accNo);
	public Account updateAccount(Account a);
	public Transaction transaction(Transaction tran);
	public void creaditAmount(int accNo,double amount);
	public void debitAmount(int accNo,double amount);
}