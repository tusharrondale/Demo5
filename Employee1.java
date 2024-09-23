class Employee1{
	private int empId;
	private String empName;
	private float empSalary;
	  
	  public Employee1(){
		  
		  empId=100;
		  empName="admim";
		  empSalary=40000.0f;
		  System.out.println("Employee Construc:!!!");
	  }
	
	public void setEmployeedetails(int empId,String empName,float empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		System.out.println("Employee details saved !!!");
		System.out.println("\tempId  : "+empId+"\tName:"+empName+"\tSalary :"+empSalary);
	}
	public void display(){
		System.out.println("Employee details:!!!");
		System.out.println("Employee ID :"+empId);
		System.out.println("\t Name:"+empName);
		System.out.println("\t Salary :"+empSalary);
	}
}
class EmployeeMainApp{
	public static void main(String[]args){
		Employee1 emp1=new Employee1();
		emp1.display();
	emp1.setEmployeedetails(101,"Tushar",15000.0f);
	}
}
 