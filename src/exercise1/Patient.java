package exercise1;

import javax.swing.JOptionPane;

/**
 * 
 * @author 300833478 Waynell Lovell
 * 
 */
public class Patient {
	private int patient_id;
	private String firstname;
	private String lastname;
	private int age;
	
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
	public void setLastName(String value)
	{
		this.lastname=value;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int value){
		this.age=value;
	}
	//	Default Constructor for Patient
	public Patient()
	{
	}
	//	multi argument constructor
	public Patient(int id,String first,String last,int age)
	{
		setPatient_id(id);
		setFirstName(first);
		setLastName(last);
		setAge(age);
	}
	public void getPatientInformation()
	{
		JOptionPane.showMessageDialog(null, "Patient info\n"
				+ "ID:"+patient_id+"\n"
				+ "Name:"+firstname+lastname+"\n"
						+ "Age:"+age);
	}
}
