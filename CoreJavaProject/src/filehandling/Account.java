package filehandling;

import java.io.Serializable;

public class Account implements Serializable{
	private int accNo;
	private String accName;
	private transient int accPin;
	public Account(int accNo, String accName, int accPin) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accPin = accPin;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccPin() {
		return accPin;
	}
	public void setAccPin(int accPin) {
		this.accPin = accPin;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + "]";
	}
	


}
