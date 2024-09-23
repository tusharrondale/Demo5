


class Employee{
	//data field
	private int empId;
	private String empName;
	private float salary;
	
	//methods
	public void setEmpId(int id){
		empId=id;
	}
	//methods
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpName(String name){
		empName=name;
	}
	//methods
	public String getEmpName(){
		return empName;
	}
	
	
	public void setEmpSalary(int salary){
		empSalary=salary;
	}
	//methods
	public float getEmpSalary(){
		return empId;
	}
}    //End of Employee class
     //EmployeeMain Class
	 class EmployeeApp{
		 
		 public static void main(String[]args){
			 //creating object of Employee Type
			 Employee emp=new Employee();
			 int id=emp.getEmpId();//method calling
			 String name=emp.getEmpName();
			 float salary=emp.EmpSalary();
			 System.out.printf("ID:%d\tName:%s\tSalary:",id,name,salary);
		 }
		 
	 }
      