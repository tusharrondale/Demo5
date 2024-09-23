class BoxVolume{
	
	int width;
	int height;
	int length;
	
	int volume(){
		int result=width*height*length;
		//result=10*10*10;
		
		return result;
	}
	
	public static void main(String[]arg){
		BoxVolume mybox1=new BoxVolume();
		BoxVolume mybox2=new BoxVolume();
		int vol;
		//mybox1.width=20;
		//mybox1.height=10;
		//mybox1.length=10;
		vol = mybox1.volume();
		System.out.println("Volume is "+vol);
		mybox2.width=20;
		mybox2.height=10;
		mybox2.length=10;
		vol = mybox2.volume();
		System.out.println("Volume is "+vol);
		
	}
}