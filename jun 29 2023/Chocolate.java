class Chocolate{
	String name="Galaxy";
	double price=80;
	String shape;
	String weight; 
	Chocolate(){
		System.out.println("Executing Chocolate");
	}
	public static void main(String[] args){
		Chocolate ref=new Chocolate();
		System.out.println("Name: "+ref.name);
		System.out.println("Price: "+ref.price);
		System.out.println("Shape: "+ref.shape);
		System.out.println("Weight: "+ref.weight);
	}
}