class AllConceptsTester{
	public static void main(String args[]){
		System.out.println("-----------Consructor-------");
		AllConcepts ref1=new AllConcepts(); //empty constructor
		AllConcepts ref=new AllConcepts(10,"Lucky");
		System.out.println(ref.number+"\t"+ref.names);
		AllConcepts mask=new AllConcepts(5.5f, 6363977693l);
		System.out.println(mask.values+"\t"+mask.mobileNum);
	
		AllConcepts refer=new AllConcepts("XworkZ",100);
		System.out.println(refer.names+"\t"+refer.number);
		System.out.println();
	
	int numberr[]={10,20,30,40,50}; // Non static array
	for(int i=0;i<numberr.length;i++){
		System.out.print(numberr[i]+"\t\n");
	}
	System.out.println();
	System.out.println("Size of static array: "+AllConcepts.arr.length); // to call another class static array
	
		
		System.out.println("Size of non static array: "+numberr.length+"\n");
     
		System.out.println("-------Print array values-----------");
	AllConcepts.printAll();
	System.out.println();
	System.out.println();
	System.out.println("-----------Add string value------------");
	//AllConcepts.add(arr[5]="\tHaveri"); //add string
	
	AllConcepts.arr[5]="\tHaveri";
	AllConcepts.add("");
	
	System.out.println();
	System.out.println();
	System.out.println("------------Update by index value [2] to change Hubli to Bidar:----------");
	AllConcepts.arr[2]="Bidar";     //Update By index 
	AllConcepts.printAllValues();
	System.out.println();
	System.out.println();
	System.out.println("get value by index [1]");
	AllConcepts.getByIndex(); //get by index value [1]
	System.out.println();
	}
}




/*		output
----------Consructor-------
Empty Constructor!!!!
10      Lucky
5.5     6363977693
XworkZ  100

10
20
30
40
50

Size of static array: 6
Size of non static array: 5

-------Print array values-----------
Bengaluru       Mangalore       Hubli   Belagavi        Tumkuru


-----------Add string value------------
Bengaluru       Mangalore       Hubli   Belagavi        Tumkuru         Haveri


------------Update by index value [2] to change Hubli to Bidar:----------
Bengaluru       Mangalore       Bidar   Belagavi        Tumkuru         Haveri

get value by index [1]
Mangalore
*/
