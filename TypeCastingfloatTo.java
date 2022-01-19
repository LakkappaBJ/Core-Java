class TypeCastingfloatTo{
	public static void main(String args[]){
		float fvalue=2.5f;
		/* byte data=fvalue;
		short sData=fvalue;
		int iData=fvalue;
		long lData=fvalue; */
		
		double dData=fvalue;
		System.out.println(dData);
		
		byte b=(byte)fvalue;
		short s=(short)fvalue;
		int i=(int)fvalue;
		long l=(long)fvalue;
		double d=(double)fvalue;
		char ch=(char)fvalue;
		System.out.println(b+" "+s+" "+i+" "+l+" "+d+" "+ch);
	}
}