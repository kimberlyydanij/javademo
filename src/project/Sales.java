package project;

public class Sales extends Member {
	
	int mSum;
	char mGrade;
	int mPoint;
	
	public Sales() {
	}

	
	public Sales(int mSum, char mGrade, int mPoint) {
		this.mSum = mSum;
		this.mGrade = mGrade;
		this.mPoint = mPoint;
	}


	//public Sales(int mNumber, String mName, char mGender, String mPhone, String mAddress, int mPoint) {
	//	super(mNumber, mName, mGender, mPhone, mAddress, mPoint);
		
	//}


	public int getmSum() {
		return mSum;
	}


	public void setmSum(int mSum) {
		this.mSum = mSum;
	}


	public char getmGrade() {
		return mGrade;
	}


	public void setmGrade(char mGrade) {
		this.mGrade = mGrade;
	}


	public int getmPoint() {
		return mPoint;
	}


	public void setmPoint(int mPoint) {
		this.mPoint = mPoint;
	}
	
	
}

