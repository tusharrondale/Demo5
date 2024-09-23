
import java.util.Scanner;// importing util package to use Scanner class


class UseeInput{
			
		public static void main(String[]arg){
			//create object of Scanner class
		    Scanner sc;//declaration
		    sc = new Scanner(System.in);//initialization
			
			int id;
			float mark;
			String Name;
			System.out.println("Enter your ID:");
			/*
			sc.nextInt()
			sc.nextByte()
			sc.nextLong()
			sc.nextFloat()
			sc.nextDouble()
			sc.next()
			sc.nextLine()
			sc.nextInt()
			*/
			id=sc.nextInt();
			System.out.println("Enter your Mark:");
			mark=sc.nextFloat();
			System.out.println("Enter your Name:");
			Name=sc.next();
			
			System.out.println("Details are:");
			System.out.println("ID:"+id+"\tname:"+Name+"\tMark:"+mark);
			//String concatenation
			
		
		
		}





}