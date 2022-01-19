class TypeCastingIntTo{
	public static void main(String args[]){
		//widening
		int number=50;
		
		long num=number;
		float value=number; 
		double values=number;
		
		System.out.println(num+"\n"+value+"\n"+values);
		//narrowing
		byte b1=(byte)number;
		short s=(short)number;
		long l=(long)number;
		float f=(float)number;
		double d=(double)number;
		char ch=(char)number;
		System.out.println(b1+" "+s+" "+l+" "+f+" "+d+" "+ch);
	}
}