class Keyboard{

 String brand;
 String color;
 int noOfKeys;
 String type;
 double cost;
 Keyboard()
 {
	 
	 System.out.println("Keyboard started no arguments");
 }
 Keyboard(String brand)
 {
	 System.out.println("brand is"+brand);
	 this.brand=brand;
 }
 Keyboard(String brand,String color)
 {
	 this.brand=brand;
	 this.color=color;
 }
 Keyboard(String brand,String color,int noOfKeys)
 {
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
 }
 Keyboard(String brand,String color,int noOfKeys,String type)
 {
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
	 this.type=type;
 }
 Keyboard(String brand,String color,int noOfKeys,String type,double cost)
 {
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
	 this.type=type;
	 this.cost=cost;
 }
 
}