//To program using this keyword and this statement 
class AeroplaneTester{
	public static void main(String args[]){
		Aeroplane op=new Aeroplane("Air India","Economy",100,80.5f,"1000 Liters");
		System.out.println(op.Bname+"\t"+op.Class+"\t"+op.seatCapacity+"\t"+op.speed+"\t"+op.fuelCapacity);
	}
}