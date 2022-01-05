class LuckyTester{
	public static void main(String args[]){
	System.out.println("to print.. No Parameters");
	Lucky ref=new Lucky();
	System.out.println(""+ref.name+"\t"+ref.age+"\t"+ref.qualification+"\t"+ref.natives+"\t"+ref.mobile);
	
	Lucky ref2=new Lucky();
	System.out.println(""+ref2.name+"\t"+ref2.age+"\t"+ref2.qualification+"\t"+ref2.natives+"\t"+ref2.mobile);
	
	System.out.println("------------------------------------------------------------------------------");
	
	System.out.println("using Five parametrs");
	Lucky clip=new Lucky("Lakkappa",26,"MSc CS","Belagavi",6363977693l);
	System.out.println("Name: "+clip.name+"\tAge: "+clip.age+"\tQualification: "+clip.qualification+"\tNative: "+clip.natives+"\tMobile_Number: "+clip.mobile);

	Lucky clip2=new Lucky("Akshay",25,"BE","Chickamagaluru",9916262155l);
	System.out.println("frnd_name "+clip2.name+"\tage: "+clip2.age+"\tQualification: "+clip2.qualification+"\tNative: "+clip2.natives+"\tMobile_Number: "+clip2.mobile);

	System.out.println("------------------------------------------------------------------------------");
	
	System.out.println("Your choice...");
	Lucky details=new Lucky("student","Learning Java");
	System.out.println("Designation: "+details.work+"\tWhich course: "+details.wname);

	Lucky details2=new Lucky("Software Developer","MNC company");
	System.out.println("Designation: "+details2.work+"\t\tType of job: "+details2.wname);
	}
}

/*
String name;
	int age;
	String qualification;
	String native;
	long mobile;
	String work;
	String wname;
*/