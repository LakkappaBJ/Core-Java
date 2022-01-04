class TraineeDetails{
	static String[]names={"Lakkappa","Umesh","Mahesh","Bharath","Akshay","Naveen","Ullas","Hemant"};
	
	static void printAll(){
		for(int index=0;index<names.length;index++){
			System.out.print(names[index]+"\t");
		}
		System.out.println();
	}
	
	static void updateName(String oldName,String newName){
		for(int index=0;index<names.length;index++){
			if(oldName.equals(names[index]))
			{
				names[index]=newName;
			}
		}
	}
}