package exercise1;

public class Patient {
	int patient_id;
	String firstname;
	String lastname;
	int age;
	
	public int getPatient_id()
	{
		return this.patient_id;
	}
	public void setPatient_id(int value)
	{
		this.patient_id=value;
	}
	public String getFirstname(){
	return this.firstname;
}
	public void setFirstName(String value){
		this.firstname=value;
	}
	public String getLastname(){
		return this.lastname;
	}
	
	public int getAge(){
		return this.age;
	}
}
