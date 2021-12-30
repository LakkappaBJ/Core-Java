class Bikes{
    static String []models = {"Yamaha MT125","Splendor+","RTR160","Dio","Pulsar 220F"};
	     static void bikeModels(){
		      for(int index=0; index<models.length; index=index+1){
			       System.out.print(models[index]+"\t");
			  }
		 }
		    public static void main(String []args){
			   bikeModels();
               System.out.println();	
			   models[2]= "XL-100";
               bikeModels();			   
			}
} 