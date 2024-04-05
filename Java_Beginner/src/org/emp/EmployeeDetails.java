package org.emp;
// child class
import org.flip.FlipKart;
public class EmployeeDetails extends FlipKart {
	private void empName() {
		System.out.println("hassan");
	}

	private void empId() {
		System.out.println(4014);
	}
	
	private void empRole() {
		System.out.println("DevOps Engineer");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails ed = new EmployeeDetails ();
		
		ed.empId();
		ed.empName();
		ed.empRole();
		ed.cmpName();
		ed.cmpId();
		ed.login();
		ed.homepage();
		ed.smartPhone();
		
		
	}

}
