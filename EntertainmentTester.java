//class and object creation
//using CRUD operation
class EntertainmentTester{
	public static void main(String args[]){
		
		EntertainmentOperation operation=new EntertainmentOperation();
		byte interest=4;
		Entertainment dt=new Entertainment("movie",1.56f,interest,true);
		operation.save(2,dt);
		operation.printAll();
		String msg=operation.update(false,"movie");
		System.out.println(msg);
		operation.printAll();
	}
}