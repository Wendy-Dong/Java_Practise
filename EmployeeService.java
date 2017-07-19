package demo;

public class EmployeeService {
	public static void main(String[] args){
		Employee e1 = new Employee("Joe Smith",20,5345);
		Employee e2 = new Employee("Lewis Jane",21,1345);
		Employee e3 = new Employee("Larry Page",22,245);
		Employee e4 = new Employee("Smith James",23,945);
		Employee e5 = new Employee("Elvis George",25,1425);
		EmployeeService empser=new EmployeeService();
		Employee[] emparray={e1,e2,e3,e4,e5};
//		emparray[0].getEmpSalary();
		for (int i=0;i<=4;i++){
				try {
					empser.checkEmpSalary(emparray[i]);
				} 
				catch (EmpSalaryException e) {
					// TODO Auto-generated catch block
					System.out.println("Exception");
//					e.printStackTrace();
				}
		}
	}
	public static void checkEmpSalary(Employee emp) throws EmpSalaryException{
		try {
			if (emp.getEmpSalary()<1000){
				throw new EmpSalaryException ("list all employees whoes salary is less than 1000");
			}
		} 
		catch (Exception e) {
			System.out.println("employee: "+emp.getEmpName()+"'s salary is less than 1000.");
		}
	}
		
}

class Employee {
	private String empName;
	private int empAge;
	private double empSalary;
	
	public Employee(String empName,int empAge,double empSalary){
		super();
		this.empName=empName;
		this.empAge=empAge;
		this.empSalary=empSalary;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public int getEmpAge(){
		return empAge;
	}
	public void setEmpAge(int empAge){
		this.empAge=empAge;
	}
	public double getEmpSalary(){
		return empSalary;
	}
	public void setEmpSalary(){
		this.empSalary=empSalary;
	}
}


class EmpSalaryException extends Exception{
		public EmpSalaryException(String msg){
			//System.out.println("Exception");
		}
}

