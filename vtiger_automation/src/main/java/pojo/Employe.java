package pojo;

public class Employe {
	
	private String name="rajesh";
	private String address="Mondh";
	private int mobNo=987654321;
	private int retirementAge=60;
	
	public void setMob(int empMobNo) {
		mobNo=empMobNo;
	}
	
	public int  getempMobNo() {
		return mobNo;
	}
	
	public void setName(String empName) {
		name=empName;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String empAddress) {
		
		address=empAddress;
		}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setRetirementAge(int empage) {
		if(empage<61) {
			retirementAge=empage;
		}
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	
}
