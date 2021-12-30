class Method{
	static void taskMethod(String []lucky){
	for(int index=0;index<lucky.length;index++){
		System.out.print(lucky[index]+"\t");
	}
	
	}
	
	
	public static void main(String args[]){	
		String arr[]={"EggRice","Palav","Masal_dosa","Kabab","Kushka","Vada"};
		taskMethod(arr);
		System.out.println();
		arr[2]="Idly_Vada";
		taskMethod(arr);
		
	}
}