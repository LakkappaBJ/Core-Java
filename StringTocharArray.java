class StringTocharArray{
	
	public static void main(String ar[]){
		for(int i=0;i<ar.length;i++){
			String name = ar[i];
			for(int j=0;j<name.length();j++){
				char c = name.charAt(j);
				System.out.print("\t"+c);
			}
			System.out.println();
		}
	}
}