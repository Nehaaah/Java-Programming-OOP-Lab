public class Product 
{
	String pcode;
	String pname;
	int price;
	
	public Product(String pcode_get,String pname_get,int price_get)
	{
		pcode=pcode_get;
		pname=pname_get;
		price=price_get;
	}
	public int get_price()
	{
		return price;
	}
	public static void main(String args[])
	{
		Product p1=new Product("A100","WATCH",5000);
		Product p2=new Product("B100","TV",20000);
		Product p3=new Product("c100","HEADPHONE",10000);

		if(p1.price<=p3.price && p1.price<=p2.price)
			System.out.println("Lowest price id is:"+p1.pcode);
		if(p3.price<=p1.price && p3.price<=p2.price)
			System.out.println("Lowest price id is:"+p3.pcode);
		if(p2.price<=p3.price && p2.price<=p1.price)
			System.out.println("Lowest price id is:"+p2.pcode);
	}
}
