class Vegitables{
     static String []vnames = {"Potato","Carrot","Radish","Tomato","Onion"}; 
	     static void vegNames(){
		    for(int index =0; index<vnames.length; index=index+1){
			    System.out.print(vnames[index]+"\t");
			}
		 }
		 public static void main(String []args){
			vegNames();
			System.out.println();
			vnames[1]= "Red pepper";
			vegNames();
		}
}