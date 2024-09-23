class Student{
	private int rollNo;
	private String name;
	private String branch;
	private String collegeName;
	
	public Student(){
		this.rollNo=1000;
		this.name="sumit";
		this.branch="CSE";
		this.collegeName="CDAC";
		System.out.println("Default constr called!!!");
		System.out.println("Student Details:");
			System.out.println("RollNo:"+rollNo);
			System.out.println("Name:"+name);
			System.out.println("Branch:"+branch);
			System.out.println("College Name:"+collegeName);
	}
	
	public Student(int rollNo,String name,String branch){
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
		this.collegeName="CDAC";
		System.out.println("Parametrized constr called!!!");
	}

		/*public void displayStudent(){
			System.out.println("Student Details:");
			System.out.println("RollNo:"+rollNo);
			System.out.println("Name:"+name);
			System.out.println("Branch:"+branch);
			System.out.println("College Name:"+collegeName);
		}
		*/
}

class StudentApp{
	public static void main(String[]args){
		Student student1=new Student();
		//student1.displayStudent();
		//Student student2=new Student(100,"Himanshu","ME");
		//student1.displayStudent();
		
		
	}
}