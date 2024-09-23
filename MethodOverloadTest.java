class MethodOverLoadTest{
	
	public int addValues(int x,int y){
		
		return x+y;//int
		
	}
	public float addValues(int x,int y,int z){
		
		return x+y+z;//int
	}
	public float addValues(float x,float y){
		return x+y;
	}
	public float addValues(int x,float y){
		return x+y; //float
	}
	public float addvalues(float x,int y){
		return x+y; //float
	}
}

class MethodOverLoadMain{
	
	public static void main(String[]args){
		
		MethodOverLoadTest obj=new MethodOverLoadTest();
		int result=obj.addValues(20,20);
		System.out.println("result:"+result);
		
		System.out.println("result:"+obj.addValues(30.4f,20.2f));
		System.out.println("result:"+obj.addValues(50.2f,50));
		System.out.println("result:"+obj.addValues(50,61.2f));
		
		
		
	}
}

