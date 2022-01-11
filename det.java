class det{
	static void add(String fname,int id, String mail,long mNo,String dateOB){
	System.out.println(fname+"\t"+id+"\t"+mail+"\t"+mNo+"\t"+dateOB);
	}
	static void updateName(String newName,long num){
		 String name=newName;
		 long mNum=num;
		System.out.println(name+"\t"+mNum);
	}
	
	static void deleteEmail(String emailId){
		String email=emailId;
		System.out.println(email);
	}
}