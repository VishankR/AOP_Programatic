package business;

import exceptions.AccNoInvalid;

public class Bank {
	private int amount = 5000;
	private String accno = "sbi123";
	
	public int deposit(int amount, String accno) {
		if(accno.equals(this.accno)) {
			this.amount = this.amount + amount;
			return this.amount;
		}
		else {
		      throw new AccNoInvalid();
		}
	}
}
