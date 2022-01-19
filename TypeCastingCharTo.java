class TypeCastingCharTo{
	public static void main(String args[]){
		char value='A';
		int data=value;
		long ldata=value;
		float fdata=value;
		double dData=value;
		System.out.println(data+" "+ldata+" "+fdata+" "+dData);
		
		//narrowing
		byte b=(byte)value;
		short s=(short)value;
		int i=(int)value;
		long l=(long)value;
		float f=(float)value;
		double d=(double)value;
		//boolean bb=(boolean)value;    //cannot convert char into boolean
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d);
	}
} 