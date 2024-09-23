/*Defining employee class */

class Employee{
	//data fields
	private int empId=0;
	private String empName;
	private float empSalary;
	
	//method
	//setter method,mutators
	public void setEmpId(int id){
		empId=id; //data writing
	}
	//getter method,inspectors
	public int getEmpId(){
		return empId;//data reading
	}
	//setter method
	public void setEmpName(String name){
		empName=name;
	}
	//getter method
	public String getEmpName(){
		return empName;
	}
	//setter method
	public void setEmpSalary(float salary){
		empSalary=salary;
	}
	//getter method
	public float getEmpSalary(){
		return empSalary;
	}
}//end of Employee class

//EmployeeApp class
class EmployeeApp{
	
	public static void main(String[]args){
		//creating object of Employee type
		Employee emp=new Employee();
		
		int id=emp.getEmpId();//method calling,data reading
		String name=emp.getEmpName();//method calling
		float salary=emp.getEmpSalary();//method calling
		
		System.out.printf("ID:%d\tName:%s\tSalary:%f\n",id,name,salary);
		emp.setEmpId(1000);//method calling ,data writing
		emp.setEmpName("sumit");
		emp.setEmpSalary(10000.0f);
		System.out.print("ID:"+emp.getEmpId());
		System.out.print("\tName:"+emp.getEmpName());
		System.out.print("\tSalary:"+emp.getEmpSalary());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
