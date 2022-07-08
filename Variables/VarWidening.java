class VarWidening{
	 static int var=20;
	public static void main(String[] args){
		int n=var; // this is called widening
		int a=90;
		float f=a;
		System.out.println(a);
		System.out.println(f);
		System.out.println(n);
		
	}
}


/*class ExampleVar{
	public static void main(String[] args){
		int a=10;
		float f=a;
		//System.out.println(a);
		System.out.println(f);
	}
}
*/