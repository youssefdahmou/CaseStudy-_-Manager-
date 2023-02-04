package Manager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager extends Person  {
	
	private int  respBonus ;
	protected  ArrayList<Employee> employees = new ArrayList<Employee>() ;
	
	
	//HashMap<String, String> capitalCities = new HashMap<String, String>();
	
	
	public Manager(String firstName ,String lastName , String entreprise ,float baseSalary ,int respBonus , ArrayList<Employee> employees2) throws ManagerException {
		// TODO Auto-generated constructor stub
		super(firstName ,lastName , entreprise ,baseSalary);
		this.respBonus = respBonus;
		this.employees = employees2 ;
		if (respBonus  < 0.2*baseSalary) {
            throw new  ManagerException();
        }
	}

	public double calculeSalary() {
		return baseSalary + respBonus ;
	}
	
	public void display() {
		System.out.println(" le nom et le prénom de l’employé : " + firstName + " " + lastName);
	}
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	public void displayEmployees() {
		for (Employee  employee : employees ) {
			System.out.println(employee.getFirstName() +" "+ employee.getLastName() );
		}
	}
	public Employee bestEmployee() {
		Employee best_one = employees.get(0);
		for (Employee  employee : employees ) {
			if (employee.isBetterThan(best_one)== 1 ) {
				best_one = employee ;
			}
		}
		return best_one;
	}
	public  ArrayList<Employee> worstEmployee() {
		ArrayList<Employee> worstEmployees = new ArrayList<Employee>();
		for (Employee  employee : employees ) {
			if (employee.getObjective() > employee.getPerformance()) {
				worstEmployees.add(employee);
			}
		}
		return worstEmployees;
		
	}
	
	
	// getters and setters 
	public int getRespBonus() {
		return respBonus;
	}
	public void setRespBonus(int respBonus) {
		this.respBonus = respBonus;
	}
	
	
	
	
}
