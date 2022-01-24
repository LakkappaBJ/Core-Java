//change array size
class ChangeArraySize{	
	public static void main(String args[]){
		int array[]=new int[5]; //array initialization using new keyword(2nd way)
		System.out.println(array.length);
		array=new int[10];
		System.out.println(array.length);
	}
}