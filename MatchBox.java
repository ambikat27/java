class MatchBox{
  String brand;
  int noOfSticks;
  double length;
  double price;
  char size;
  double weight;
  String type;
  
  MatchBox()
  {
  System.out.println("Keyboard started no arguments");
  }
  MatchBox(String brand)
  {
	 this.brand=brand;
	 
  }
  MatchBox(String brand,int noOfStick)
  {
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 
  }
  MatchBox(String brand,int noOfStick,double length)
  {
	 this.brand=brand;
	  this.noOfSticks=noOfSticks;
	 this.length=length;
	 
	 
  }
  MatchBox(String brand,int noOfStick,double length,double price)
  {
	 this.brand=brand;
	  this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
  }
  MatchBox(String brand,int noOfStick,double length,double price,char size)
  {
	 this.brand=brand;
	  this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
  }
  MatchBox(String brand,int noOfStick,double length,double price,char size,double weight )
  {
	 this.brand=brand;
	  this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
	 this.weight=weight;
  }
MatchBox(String brand,int noOfStick,double length,double price,char size,double weight,String type )
  {
	 this.brand=brand;
	  this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
	 this.weight=weight;
	 this.type=type;
  }
  
  
  
}