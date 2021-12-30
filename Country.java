class Country{
	   static String []names = {"India","Germany","Nepal","Sri Lanka","South Africa",};
		      static void countryNames(){
		         for(int index=0; index<names.length; index++){
					   System.out.print(names[index]+"\t");
		         }
	          }
	    public static void main(String []args){
		     countryNames();
			 System.out.println();
			 names[1]= "Brazil";
			 countryNames();
		}
}