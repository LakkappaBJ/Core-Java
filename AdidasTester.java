class AdidasTester{
	public static void main(String []args){
	Adidas ref=new Adidas();
	System.out.println("\tshirt: "+ref.shirt+"\tbelt: "+ref.belt+"\tpant: "+ref.pant+"\tshoes: "+ref.shoes+"\tbag: "+ref.bagPrice);
	
	Adidas Reference=new Adidas();
	System.out.println("\tshirt: "+Reference.shirt+"\tbelt: "+Reference.belt+"\tpant: "+Reference.pant+"\tshoes: "+Reference.shoes+"\tbag: "+Reference.bagPrice);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	Adidas call=new Adidas("Formal Shirts","Jeans","Running Shoes","Lether",599);
	System.out.println("\tshirt: "+call.shirt+"\tpant: "+call.pant+"\tshoes: "+call.shoes+"\tbelt: "+call.belt+"\tbagPrice:  "+call.bagPrice);
	
	Adidas value=new Adidas("casual","cotton Jeans","loafers","cloth",1000);
	System.out.println("\tshirt type: "+value.shirt+"\t pant type: "+value.pant+"\tshoes type: "+value.shoes+"\tbelt type"+value.belt+"\tbag Offer: "+value.bagPrice);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	
	Adidas offer=new Adidas(999,499);
	System.out.println("\tPick any one : "+offer.num+"\t buy one get one at "+offer.number);
	
	Adidas offer2=new Adidas(10000,5000);
	System.out.println("\tshop worth: "+offer2.num+"\t get return "+offer2.number);
	}
}
