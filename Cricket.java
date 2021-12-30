class Cricket{
     static String teams[]={"RCB","DC","KKR","RR","CSK"}; 
	     static void teamNames(){
		    for(int index =0; index<teams.length; index++){
			    System.out.print(teams[index]+"\t");
			}
		 }
		     public static void main(String []args){
			    teamNames();
				System.out.println();
				teams[0]= "Namm Bengaluru";
				teamNames();
			 }
}