package Manager;

public class Employee extends Person implements  Comparable {
	private int  performance ; 
	private int prfBonus ;
	private int objective ;
	private Manager manager ;
	
	public Employee(String firstName ,String lastName , String entreprise ,float baseSalary ,int  performance , int prfBonus ,int objective ,Manager manager) {
		// TODO Auto-generated constructor stub
		super(firstName ,lastName , entreprise ,baseSalary);
		this.prfBonus = prfBonus;
		this.performance = performance ;
		this.objective = objective ;
		this.manager = manager ;
	}

	
	public double calculeSalary() {
		if (performance > 1 ) {
			return baseSalary + prfBonus ;
		}
		else {return baseSalary;}
	}
	
	
	public void display() {
		System.out.println("  le nom et le prénom de l’employé  : " + firstName + " " + lastName);
	}
	
	
	public int isBetterThan(Employee employee ) {
		if (performance < employee.getPerformance()) {
			return -1 ;
		}
		else {
			if (performance  == employee.getPerformance()) {
				return 0 ;
			}
			else {
				return 1 ;
			}
		}
		
	}
	
	
	
	
	public int getPerformance() {
		return performance;
	}


	public void setPerformance(int performance) {
		this.performance = performance;
	}


	public int getPrfBonus() {
		return prfBonus;
	}


	public void setPrfBonus(int prfBonus) {
		this.prfBonus = prfBonus;
	}


	public int getObjective() {
		return objective;
	}


	public void setObjective(int objective) {
		this.objective = objective;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


	@Override
	public boolean isBetterThen(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
