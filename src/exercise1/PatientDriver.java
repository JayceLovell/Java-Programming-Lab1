package exercise1;

import javax.swing.JOptionPane;

public class PatientDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Patient defaultpatient = new Patient(1,"Lucy","Brown",25);

		
		
		Patient userpatient = new Patient();

		
		userpatient.setPatient_id(Integer.parseInt(JOptionPane.showInputDialog("Please Enter Patient's id.")));
		
		userpatient.setFirstName(JOptionPane.showInputDialog("Please Enter Patient's First Name"));
		
		userpatient.setLastName(JOptionPane.showInputDialog("Please Enter Patient's Last Name"));
		
		userpatient.setAge(Integer.parseInt(JOptionPane.showInputDialog("Please Enter Patient's Age")));
		while(userpatient.getAge()<19)
		{
			JOptionPane.showMessageDialog(null, "Error in Enter of Age.");
			userpatient.setAge(Integer.parseInt(JOptionPane.showInputDialog("Please Enter Patient's Age")));
		}
		String search = JOptionPane.showInputDialog("Please Enter the First name of Patient you want to display");
		
		if(userpatient.getFirstname().equals(search))
		{
			userpatient.getPatientInformation();
		}
		else if(defaultpatient.getFirstname().equals(search))
		{
			defaultpatient.getPatientInformation();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Sorry! No patient found!");
		}
		
	}

}
