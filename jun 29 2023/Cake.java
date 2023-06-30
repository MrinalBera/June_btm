class Cake{
	String name="Red Velvet";
	double price=400;
	String shape;
	String weight; 
	Cake(){
		System.out.println("Executing Cake");
	}
	public static void main(String[] args){
		Cake ref=new Cake();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}