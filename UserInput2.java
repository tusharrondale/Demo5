
import java.util.Scanner;


class UserInput2{
		
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			char grade;
			System.out.println("Enter grade value");
			grade = sc.next().charAt(0);//A
			System.out.println("Your grade:"+grade);
		}


} 