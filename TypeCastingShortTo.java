class TypeCastingShortTo{
	public static void main(String args[]){
			//widening
			short data=100;
			//byte value=data;    //incompatible types: possible lossy conversion from short to byte
			int info=data;
			long values=data;
			float fnum=data;
			double dnum=data;
			System.out.println(info+"\n"+values+"\n"+fnum+"\n"+dnum);
			
			//Narrowing
			short value=112;
			
			byte rate=(byte)value;
			int serial=(int)value;
			long serial2=(long)value;
			float fdata=(float)value;
			double ddata=(double)value;
			char ch=(char)value; 	
			
			System.out.println(rate+"\n"+serial+"\n"+serial2+"\n"+fdata+"\n"+ddata+"\n"+ch);
	}
}