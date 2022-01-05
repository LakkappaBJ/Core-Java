class FanTester{
	public static void main(String args[]){
	Fan ref=new Fan();
	System.out.println(" "+ref.brand+" "+ref.type+" "+ref.color+" "+ref.speed+" "+ref.blades);
	
	Fan ref1=new Fan();
	System.out.println(" "+ref1.brand+" "+ref1.type+" "+ref1.color+" "+ref1.speed+" "+ref1.blades);
	System.out.println();

	Fan detail=new Fan("Bajaj","table","chocolate",10,4);
	System.out.println("Brand name: "+detail.brand+"\ttype: "+detail.type+"\tFan color: "+detail.color+"\tFan Speed: "+detail.speed+"\t NO.of.blades: "+detail.blades);
	
	Fan detail2=new Fan("Orient","Ceiling","White",50,3);
	System.out.println("Brand name: "+detail2.brand+"\ttype: "+detail2.type+"\tFan color: "+detail2.color+"\tFan Speed: "+detail2.speed+"\t NO.of.blades: "+detail2.blades);
	System.out.println();
	Fan fan=new Fan(1.5f,5);
	System.out.println("Dimension: "+fan.dimension+"\tRound: "+fan.rounds);
	
	Fan fan2=new Fan(0.5f,10);
	System.out.println(""+fan2.dimension+"\t"+fan2.rounds);
	}

}







/*
String brand;
String type;
String color;
int speed;
int blades;
float dimension;
byte rounds;
*/