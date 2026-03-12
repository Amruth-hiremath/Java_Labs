package lab6_part_b;

import java.util.Scanner;

class Employee{
	String name;
	String job_title;
	double basic_salary;
	double hra;
	double da;
	int incentive;
	
	Employee(){
		this.basic_salary = 50000;
		this.hra = 15;
		this.da = 20;
		this.incentive = 10000;
	}
	
	Employee(String name, String job_title){
		this();
		this.name = name;
		this.job_title = job_title;
	}
	
	double calc(){
		hra = basic_salary * (hra/100);
		da = basic_salary * (da / 100);
		return basic_salary + hra + da;
	}
	double calc(int incentive) {
		return calc() + incentive;
	}
	void display(double finalSalary) {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + job_title);
        System.out.println("Gross Salary: " + finalSalary + "\n");
    }
}

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter the employee job title: ");
		String job_title = sc.nextLine();
		
		Employee e1 = new Employee();
		e1.name = "Amruthesh";
		e1.job_title = "Intern";
		e1.display(e1.calc());
		
		System.out.println("----------------------");
		
		Employee e2 = new Employee(name, job_title);
		e2.display(e2.calc(e2.incentive));
		sc.close();
	}

}
