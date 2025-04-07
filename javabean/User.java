package com.bankingsystem.javabean;

public class User {

	String bankName;

	@Override
	public String toString() {
		return "User [bankName=" + bankName + ", fullName=" + fullName + ", email=" + email + ", moNumber=" + moNumber
				+ ", ifsc=" + ifsc + ", accountType=" + accountType + ", ammount=" + ammount + ", pin=" + pin
				+ ", geAccountNo=" + geAccountNo + "]";
	}

	public String fullName;
	String email;
	String moNumber;
	String ifsc;
	String accountType;
	double ammount;
	String pin;
	String geAccountNo;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMoNumber() {
		return moNumber;
	}

	public void setMoNumber(String moNumber) {
		this.moNumber = moNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
//		if (ammount <= 0) {
//			this.ammount -= ammount;
//		} else {
//			this.ammount += ammount;
//		}
		this.ammount = ammount;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getGeAccountNo() {
		return geAccountNo;
	}

	public void setGeAccountNo(String geAccountNo) {
		this.geAccountNo = geAccountNo;
	}

}
