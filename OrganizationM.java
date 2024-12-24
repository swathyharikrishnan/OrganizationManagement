package miniproject;
import java.util.*;

public class OrganizationM {
	static class Employee{
		int id;
		String name;
		String department;
		double salary;
		public Employee(int id, String name, String department, double salary) {
		
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
		}
		
		
		
	}

	public static void main(String[] args) {
		Map<Integer, Employee> employees=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("\n===Organization Management System===");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All Employees");
			System.out.println("3.Search Employee by ID");
			System.out.println("4.update Employee Details");
			System.out.println("5.Exit");
			System.out.println("Choose an option:");
			
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Employee Id:");
			int id=scan.nextInt();
			System.out.println("Enter Employee Name:");
			String name=scan.next();
			
			System.out.println("Enter Department name:");
				String department = scan.next();
				System.out.println("Enter employee Salary:");
				double salary=scan.nextDouble();
				employees.put(id, new Employee(id,name,department,salary));
				System.out.println("Employee added successfully!");
				break;
				
			case 2:
				if(employees.isEmpty()) {
					System.out.println("No employee found.");
					
				}
				else {
					System.out.println("\n--- Employee list---");
					for(Employee employee:employees.values()) {
						System.out.println(employee);
					}
				}
				break;
			case 3:
				System.out.println("Enter Employee ID to search:");
				int searchId=scan.nextInt();
				if(employees.containsKey(searchId)){
					System.out.println("Employee Found:"+employees.get(searchId));
					
				}
				else {
					System.out.println("Employee withId"+searchId+"not found.");
					
				}
				break;
			case 4:
				System.out.println("Enter Employee Id to update:");
				int updateid=scan.nextInt();
				if(employees.containsKey(updateid)) {
					scan.nextLine();
					System.out.println("Enter New Name(leave blank to keep unchnged):");
					String newName=scan.next();
					System.out.println("Enter New Salary(enter-1 to keep unchanged):");
					String newDept=scan.nextLine();
					System.out.println("Enter New salary(enter-1 to keep uncharged):");
					double newsalary=scan.nextDouble();
					Employee emp=employees.get(updateid);
					if(!newName.isEmpty())emp.name=newName;
					if(!newDept.isEmpty())emp.department=newDept;
					if(newsalary!=-1)emp.salary=newsalary;
					System.out.println("Employee details update successfully!");
					
					}
				else {
					System.out.println("Employee with ID"+updateid+"not found.");
				}
				break;
			case 5:
				System.out.println("Exiting...Thank you!");
				scan.close();
				System.exit(0);
				break;
				default:
					System.out.println("Invalid option! please try again.");
			
			
			}
		}
		

	}

}
