//To program using this keyword and this statement 
class Aeroplane{
	String Bname;
	String Class;
	int seatCapacity;
	float speed;
	String fuelCapacity;
	
	Aeroplane(){   //zero parameters
		System.out.println();
		System.out.println("using this keyword");
		System.out.println();
	}
	
	Aeroplane(String Bname){
		this();
		this.Bname=Bname;
		System.out.println("Hiiiiiiiii");
	}
	
	Aeroplane(String Bname,String Class,int seatCapacity,float speed,String fuelCapacity){
	
	this("IndiGo");
	//this.Bname=Bname;
	this.Class=Class;
	this.seatCapacity=seatCapacity;
	this.speed=speed;
	this.fuelCapacity=fuelCapacity;
	}
}