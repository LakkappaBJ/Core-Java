//to convert String to byte Using wrapper class
class StringToByte{
	public static void main(String ar[]){
		for(int i=0;i<ar.length;i++){
			byte b=Byte.parseByte(ar[i]);
			System.out.println(b);
		}
	}
}