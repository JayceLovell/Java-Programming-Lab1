package exercise1;

import javax.swing.JOptionPane;

public class PatientDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

		if(JOptionPane.showInputDialog("Please Enter the First name of Patient you want to display")==userpatient.getFirstname())
		{
			userpatient.getPatientInformation();
		}
		else if(JOptionPane.showInputDialog("Please Enter the First name of Patient you want to display")==defaultpatient.getFirstname())
		{
			defaultpatient.getPatientInformation();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Sorry! No patient found!");
		}
		
	}

}
