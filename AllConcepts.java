class AllConcepts{
	int number;   //instance variable
	String names;
	static short var=300;  //static variable
	static String arr[]={"Bengaluru","Mangalore","Hubli","Belagavi","Tumkuru",null}; //static array
	
	AllConcepts(){
		System.out.println("Empty Constructor!!!!");
	}
	AllConcepts(int num,String value){
		number=num;
		names=value;
	}
	float values;
	long mobileNum;
	
	AllConcepts(float valueOf, long mobNum){
		values=valueOf;
		mobileNum=mobNum;
	}
	
	AllConcepts(String ref,int num){
			names=ref;
			number=num;
	}
	
	static void printAll(){
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	static void printAllValues(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	static void add(String S){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	static void getByIndex(){
	
			System.out.print(arr[1]+"\t");
		
	}
}