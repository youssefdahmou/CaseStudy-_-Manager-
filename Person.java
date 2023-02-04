package Manager;

import java.util.ArrayList;

public abstract class Person {
	protected  String firstName  ;
	protected String lastName ;
	protected String entreprise;
	protected float  baseSalary;
	
	public Person(String firstName ,String lastName , String entreprise ,float baseSalary) {
		// TODO Auto-generated constructor stub
		this.firstName =firstName ;
		this.lastName =lastName;
		this.entreprise = entreprise ;
		this.baseSalary = baseSalary;
	}
	public abstract  double calculeSalary();
	public abstract void display();
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public static void main(String[] args) throws ManagerException {
		// TODO Auto-generated method stub
		ArrayList<Employee> Employees = new ArrayList<Employee>();
		
		System.out.println("-------------------------------------");
		Manager ahmed = null ;
		
		System.out.println(ahmed.calculeSalary());
		
		
		System.out.println("-------------------------------------");
		Employee youssef = new Employee("youssef","a" , "green solutions" ,11000,300 , 3000 ,5 ,ahmed);
		Employee mohammed = new Employee("mohammed","" , "green solutions" ,10000,200 ,3000 ,5 ,imane);
		Employee mouna = new Employee("mouna","a" , "green solutions" ,11000,100 , 3000 ,5 ,ahmed);
		Employees.add(mohammed);
		Employees.remove(0);
		Employees.add(youssef);
		Employees.add(mouna);
		
		ahmed = new Manager("ahmed","a", "green solutions" ,18000 ,3000 , Employees);
		Manager imane = new Manager("imane","a", "green solutions" ,15000 ,5000 , Employees);
		
		ArrayList<Person> collaborateurs = new ArrayList<Person>(Employees);
		collaborateurs.add(ahmed);
		System.out.println(ahmed.bestEmployee().getFirstName());
		
		
		System.out.println("-----------------------------------------------------");
		ArrayList<Employee> a = ahmed.worstEmployee();
		System.out.println(" worst employes are : ");
		for (Employee employee : a) {
			System.out.println(employee.getFirstName() +" "+ employee.getLastName());
		}
		
	
	
	}

}
