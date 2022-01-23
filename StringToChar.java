class StringToChar{
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			String ar=args[i];
			char ch[]=ar.toCharArray();
			System.out.println(ch);
		}
	}
}