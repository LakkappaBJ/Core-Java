class DetailsTester{
	public static void main(String args[]){
		Details dtos[]=new Details[5];
	Details dto=new Details("Lakkappa",28,"lakkappabj.xworkz@gmail.com",6363977693l,"14-06-1996");
	Details ref=new Details("Akshay C S",27,"   csakshay@gmail.com   ",9916262155l,"27-08-1997");
	Details ref1=new Details("Ullas   ",20,"ullasbk@gmail.com",9916262155l,"26-12-1997");
	Details ref2=new Details("Hemanth R E",26,"hemanth8183@gmail.com",9916262155l,"01-04-1999");
	Details ref3=new Details("Shankar   ",16,"shankargs@gmail.com",9916262155l,"19-11-1999");
	
	dtos[0]=dto;
	dtos[1]=ref;
	dtos[2]=ref1;
	dtos[3]=ref2;
	dtos[4]=ref3;
	
	for(int i=0;i<dtos.length;i++){
		System.out.println(dtos[i].name+"\t"+dtos[i].aId+"\t"+dtos[i].email+"\t"+dtos[i].number+"\t"+dtos[i].DOB);
	}
	det.add("Umesh B N",21,"umeshbn@gmail.com",9916262155l,"10-05-1997");
	System.out.println("Update name and number");
	det.updateName("Lucky",8970900929l);
	System.out.println("Delete email");
	det.deleteEmail("csakshay@gmail.com ");
	}
}