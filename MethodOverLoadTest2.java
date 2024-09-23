class MethodOverLoadTest2{
	
	
	public float addValues(int x,float y){
		System.out.println("int float");
		return x+y;//float
	}
	public float addValues(float x,int y){
		System.out.println("float int");
		return x+y;//float
		
	}
}

class MethodOverLoadMain{
	public static void main(String[]args){
		MethodOverLoadTest2 obj=new MethodOverLoadTest2();
		
		float Result=obj.addValues(30.4f,50);
		float Result=obj.addValues(30,42f);
		System.out.println("result:"+Result);
		System.out.println("result:"+Result);
	}
}
