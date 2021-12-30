class Cars{
    static String []car={"nano","seltos","alto","ertiga","baleno",};
	     static void carNames(){
		      for(int model=0; model<car.length; model++){
			       System.out.print(car[model]+"\t");
			  }
		 }
		    public static void main(String []args){
			   carNames();
               System.out.println();	
			   car[2]= "Innova";
               carNames();			   
			}
} 