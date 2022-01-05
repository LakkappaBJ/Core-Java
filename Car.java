class Car{
	
	static void listenMusic(){
		System.out.println("Listening some songs");
	}
	static void listenMusic(String songName){
		System.out.println(songName);
	}
	static void listenMusic(int num, String list){
			System.out.println(num+" "+list);
	}
	static void listenMusic(String list,double num ){
		System.out.println(list+" "+num);
	}
	//=======================================================================
	static void driving(){
		System.out.println("Enjoy your driving......!!!");
	}
	static void driving(String drive){
		System.out.println("Go...slow..limit your speed less than 50 !!!!");
		
	}
	static void driving(int limitspeed,String name){
		System.out.println(limitspeed+"  "+name);
	}
	static void driving(String name,int number){
		System.out.println(name+" "+number);
	}
//=====================================================================	
	static void stunt(){
		System.out.println("Awesome stunt.....");
	}
	static void stunt(String type){
		System.out.println("round");
	}
	static void stunt(int a, int b){
		System.out.println(a+b);
	}
	static void stunt(String name,int num){
		System.out.println("Stunt it is a dangerous activity");
	}
	//===================================================================
	static void sleeping(){
		System.out.println("sleep as a baby");
	}
	static void sleeping(String name){
		System.out.println("It has inside the AC");
	}
	static void sleeping(boolean IsEnjoy ,String name){
		System.out.println("Yes I am full enjoying");
	}
	
	static void travelling(){
		System.out.println("I Love Travelling");
	}
	static void travelling(String name){
		System.out.println("Travelling is the healthiest addiction");
	}
	static void travelling(String name,int num){
		System.out.println("To travel is To love  "+num);
	}
	static void travelling(int num,String name){
		System.out.println(num+"  Seating capacity ");
	}
	public static void main(String []args){
		listenMusic();
		listenMusic("your choice");
		listenMusic(10,"kannada");
		listenMusic("New song",1.2);
		System.out.println();
		
		driving();
		driving("");
		driving(60,"Don't drink and drive");
		driving("Amazing driving",100);
		System.out.println();
		
		stunt();
		stunt("");
		stunt(10,20);
		stunt("",33);
		
		sleeping();
		sleeping("");
		sleeping(true,"");
		sleeping();
		System.out.println();
		
		travelling();
		travelling("");
		travelling("",5);
		travelling(7,"");
	}
}