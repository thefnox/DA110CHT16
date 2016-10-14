package exercise6;

public class Person {
	
	private String name;
	private String SSN;
	private String address;
	private int phoneNumber;
	public String getName() {
		return name;
	}
	public String getSSN() {
		return SSN;
	}
	public String getAddress() {
		return address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	

}
