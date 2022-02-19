import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalanceApplication {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		System.out.println("Quantidade de funcion�rios:");
		String totalEmployeesString = read.next();
		int totalEmployeesInt = Integer.parseInt(totalEmployeesString);
		 
		int i = 0;
		
		while(i < totalEmployeesInt) {
			System.out.println("nome do funcion�rio: ");
			String name = read.next();
			System.out.println("sal�rio do funcion�rio: ");
			String salaryString = read.next();
			Float salary = Float.parseFloat(salaryString);
			
			employees.add(new Employee(name, salary));
			i++;
		}
		

		for(int j = 0; j < employees.size(); j++) {	
			System.out.println("\n");
			System.out.println("Funcion�rio: " + employees.get(j).getName());
			System.out.println("Sal�rio: " + employees.get(j).getSalary());
			employees.get(j).calculateBonus();
			System.out.println("Sal�rio Liquido: " + employees.get(j).calculateSalary());
		}
		
		
		
		
		
	}
}
