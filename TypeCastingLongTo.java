class TypeCastingLongTo{
	public static void main(String args[]){
		long num=100;
		/* byte number=num; //incompatible types: possible lossy conversion from long to byte
		short s=num;     //incompatible types: possible lossy conversion from long to short
		int i=num;	 */	//incompatible types: possible lossy conversion from long to int
		float f=num;
		double d=num;
		// char ch=num; incompatible types: possible lossy conversion from long to char
		System.out.println(f+" "+d);
		
		//narrowing
		byte data=(byte)num;
		short data1=(short)num;
		int data2=(int)num;
		float data3=(float)num;
		double data4=(double)num;
		char data5=(char)num;
		System.out.println(data+" "+data1+" "+data2+" "+data3+" "+data4+" "+data5);
	}

}