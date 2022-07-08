class localstatic{
	static int rate; // outside the method
  public static void main(String[] a){
		float price=45000;
		System.out.println(price);
		rate=25;
		System.out.println(rate);
// rate=25; //after pf stmt it will show default value(.0)
  } 
  //static int rate; // outside the method
}