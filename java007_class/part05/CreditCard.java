package java007_class.part05;

import java001_basic.Java004_casting;

public class CreditCard {
	String cardName;
	String cardNum;
	int pay;
	
	public CreditCard() {

	}

	public CreditCard(String cardName, String cardNum, int pay) {

		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}

	public String toString() {
		
		return String.format("%s %s %d", cardName, cardNum, pay);
	}
}
