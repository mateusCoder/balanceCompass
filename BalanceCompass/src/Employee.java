
public class Employee {
	private String name;
	private float salary;
	
	
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float calculateSalary() {
		if(salary <= 1000) {
			return salary*= 1.2;
		}else if(salary <= 2000) {
			return salary *= 1.1;
		}else {
			return salary*=0.9;
		}
	}
	
	public void calculateBonus() {
		float bonus;
		
		if(salary <= 1000) {
			 bonus = (float) (salary * 0.2);
			 System.out.println("Bonus: " + bonus);
		}else if(salary <= 2000) {
			bonus = (float) (salary * 0.1);
			System.out.println("Bonus: " + bonus);
		}else {
			bonus = (float) (salary * 0.1);
			System.out.println("Desconto: " + bonus);
		}
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"nome = " + name +
				", salario = " + salary + 
				'}';
	}
}
