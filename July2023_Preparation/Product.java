

class Product{
	private int pId;
	private String pName;
	float  pPrice;
	private String pBrand;
	
	//methods
	public void setProductData(int pId,String pName,float pPrice,String pBrand){
		
		this. pId=pId;
		this.pName=pName;
		this.pPrice=pPrice;
		this.pBrand=pBrand;
	}
	public void displayProductDetails(){
		System.out.println("Product Details:");
		System.out.printf("ID:%d\tBrand:%s\tName:%s\tPrice:%f",pId,pBrand,pName,pPrice);
		
	}
}
	
	
class ProductApp{
	public static void main(String[]args){
		Product p1=new Product();
		p1.setProductData(100,"Mobile",9999.0f,"Motorola");
		p1.displayProductDetails();
	}
}
