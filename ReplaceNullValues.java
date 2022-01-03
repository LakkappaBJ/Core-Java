class ReplaceNullValues{
	static String name[]={null,null,null,null,null,null,null,null,null,null,
							null,null,null,null,null,null,null,null,null,null,
						null,null,null,null,null,null,null,null};
						
	
		
		static void printAll(){
			for(int num=0;num<name.length;num++){
				System.out.print(name[num]+"\t");
			}
			System.out.println();
		}
		
		static void updateValue(String oldName,String newName){
			for(int num=0;num<name.length;num++){
				if(oldName.equals(name[num])){
					name[num]=newName;
				}
			}
		}
		static void change(int index,String updateName){
			
				name[index]=updateName;
		}	
}