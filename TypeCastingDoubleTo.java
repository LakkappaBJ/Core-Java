class TypeCastingDoubleTo{
	public static void main(String ar[]){
		double data=126.6;
		//widening is not converting in double
	
		//narrowing
		byte number=(byte)data;
		short num=(short)data;
		int num1=(int)data;
		long longNum=(long)data;
		float fnum=(float)data;
		char ch=(char)data;
		System.out.println(number+" "+num+" "+num1+" "+longNum+" "+fnum+" "+ch);
	}
}