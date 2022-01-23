//to convert String to primitive data type using wrapper class
class StringToPrimitiveDt{
	public static void main(String args[]){
		String s="111";
		byte b=Byte.parseByte(s);
		System.out.println(b);
		
		String s1="12345";
		short sh=Short.parseShort(s1);
		System.out.println(sh);
		
		String s2="321546";
		int in=Integer.parseInt(s2);
		System.out.println(in);
		
		String s3="6363977693";
		long l=Long.parseLong(s3);
		System.out.println(l);
		
		String s4="5";
		float f=Float.parseFloat(s4);
		System.out.println(f);
		
		String s5="5324";
		double d=Double.parseDouble(s5);
		System.out.println(d);
		
		String s6="Lucky";
		boolean bb=Boolean.parseBoolean(s6);
		System.out.println(bb);
		
		String s7="A2Z";
		for(int i=0;i<s7.length();i++){
			char ch=s7.charAt(i);
			System.out.println(ch);
		}
	}
}