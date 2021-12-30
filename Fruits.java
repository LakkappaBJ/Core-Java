class Fruits{
	static String []fname={"Apple","Banana","Orange","Grapes","Pineapple"};
		static void fruitsList(){
			for(int fruit=0;fruit<fname.length;fruit++){
				System.out.print(fname[fruit]+"\t");
			}
		}
	public static void main(String args[]){
		fruitsList();
		System.out.println();
		fname[2]="Mango";
		fruitsList();
	}
}