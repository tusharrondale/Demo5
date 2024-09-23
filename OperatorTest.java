class OperatorTest{
	
	public static void main(String[]args){
		/*
		int x=25;
		int y=--x; //x=24,y=24
		System.out.println("value of Y:"+y);//shift+home 24
		System.out.println("value of Y:"+x--);//x=24,x=23
		y=x--;//y=23,x=22
		System.out.println("value of Y:"+y);//23
		System.out.println("value of Y:"+(--x));//21
		*/
		/*
		int x=20;
		int y=++x + ++x;
		System.out.println("value of y:"+y);
		*/
		/*
		int x=20;
		//int y=!(x>30);
		//boolean
		boolean y=!(x>30);
		System.out.println("value of y:"+y);
		*/
		/*
		int x=30;
		int y=35;
		if ((x<40)&& (++y>50)){
			System.out.println("cdac");
		}
		else
			System.out.println("astric");
		
		System.out.println("value of y:"+y);
		*/
		int x=15;
		int y=20;
		int z=y+5*x--;
		System.out.println("value of z:"+z);
		
		
		
	}
}