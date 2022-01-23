class StringToBoolean{
	public static void main(String ar[]){
		for(int i=0;i<ar.length;i++){
			boolean bl=Boolean.parseBoolean(ar[i]);
			System.out.println(bl);
		}
	}
}