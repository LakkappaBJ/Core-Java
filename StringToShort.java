class StringToShort{
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			short sh=Short.parseShort(args[i]);
			System.out.println(sh);
		}
	}
}