class TypeCastingbooleanTo{
	public static void main(String[] args){
		boolean isValue=true;
		//widening...only itself 
		//narrowing...only itself
		boolean number=(boolean)isValue;
		System.out.println(number);
	}
}