class FactorialStringArgs{
	public static void main(String args[]){
		/* int i= Integer.parseInt(args[0]);
		int n= Integer.parseInt(args[1]);
		int fact=1;
		for(;i<=n;i++){
			for(int j=1;j<=i;j++){
				fact= fact*j;
			}
			System.out.println(fact);
			fact =1;
		} */
		
		int n= Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1;i<=n;i++){
			fact= fact*i;
			System.out.println(i+"!="+fact);
		}	
	}
}