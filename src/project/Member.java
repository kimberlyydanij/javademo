package project;

import java.util.Scanner;

public class Member {

	private int mNumber;
	private String mName;
	private char mGender;
	private String mPhone;
	private String mAddress;
	Scanner sc = new Scanner(System.in);
	
	public Member() {
	
	}

	

	public Member(int mNumber, String mName, char mGender, String mPhone, String mAddress) {
		this.mNumber = mNumber;
		this.mName = mName;
		this.mGender = mGender;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
	}


	public int getmNumber() {
		return mNumber;
	}



	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}



	public String getmName() {
		return mName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}



	public char getmGender() {
		return mGender;
	}



	public void setmGender(char mGender) {
		this.mGender = mGender;
	}



	public String getmPhone() {
		return mPhone;
	}



	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}



	public String getmAddress() {
		return mAddress;
	}



	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}



	@Override
	public String toString() {
		return "Member [mNumber=" + mNumber + ", mName=" + mName + ", mGender=" + mGender + ", mPhone=" + mPhone
				+ ", mAddress=" + mAddress + "]";
	}


}
