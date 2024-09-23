class MethodDemo{
	void test(){
		System.out.println("No Parameters");
	}
	void test(int a){
		a=4;
		System.out.println("A:"+a);
	}
	void test(int a,int b){
		a=5;
		b=4;
		System.out.println("A and B :"+a+"  "+b);
	}
	double test(double a){
		System.out.println("double A :"+a);
		a=12.4;
		return a*a;
	}
}

class OverLoad{
	public static void main(String[]args){
		MethodDemo obj1=new MethodDemo();
		double result;
		obj1.test();
		obj1.test(25);
		obj1.test(21,23);
		result=obj1.test(12.4);
		System.out.println("Result obj1.test double:"+result);
	}
}