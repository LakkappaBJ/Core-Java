//TypeCasting byte to all primive datatypes
class TypeCasting{
	public static void main(String args[]){
		byte num=10;
		short number=num; //widening(smmall to larger)
		int value=num;
		long longNum=num;
		float fValue=num;
		double dValue=num;
		System.out.println(number+"\n"+value+"\n"+longNum+"\n"+fValue+"\n"+dValue);
		/*
		char character=num;
		System.out.println(character); // it is not convert char to byte
		
		boolean isValue=num;
		System.out.println(isValue); */
	//narrowing (larger to small)
	byte val=67;
	short numb=(short)val;
	int numb1=(int)val;
	long numb2=(long)val;
	float numb3=(float)val;
	double numb4=(double)val;
	char numb5=(char)val;
	//boolean numb6=(boolean)val;    //incompatible types: byte cannot be converted to boolean
	System.out.println(numb+"\n"+numb1+"\n"+numb2+"\n"+numb3+"\n"+numb4+"\n"+numb5);
	
	}
}