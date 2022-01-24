//to program swap two numbers without using third variable.
class SwapOperation{
	public static void main(String args[]){
		//arithmetic operation compiler time user providing values
		/* int a=10,b=20;
		System.out.println("Before swaping:" +a+" "+b);
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("Aftre swaping: "+a+" "+b); */
		
		//runtime providing String arguments
		
			int m=Integer.parseInt(args[0]); //wrapper class
			int n=Integer.parseInt(args[1]);
		System.out.println("Before swaping:" +m+" "+n);
		m=m+n; //10+20=30
		n=m-n; //30-20=10
		m=m-n; //30-10=20
		System.out.println("Aftre swaping: "+m+" "+n);
	}
}