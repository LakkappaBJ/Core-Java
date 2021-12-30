class States{
	   static String []names = {"Karnataka","Maharastra","Gujarat","Tamilnadu","Andra Pradesh"};
		      static void stateNames(){
		         for(int index=0; index<names.length; index++){
					   System.out.print(names[index]+"\t");
		         }
	          }
	    public static void main(String []args){
		     stateNames();
			 System.out.println();
			 names[1]= "Rajasthan";
			 stateNames();
		}
}