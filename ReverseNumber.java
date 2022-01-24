//without using any methods just we use mathematical operation.
class ReverseNumber{
	public static void main(String args[]){
		//using arithmetic operation
		/* int reverse=0;
		for(int num=143;num!=0;num=num/10){
		 int rem=num%10;
		 reverse=reverse*10+rem;
		}		
		System.out.println(reverse); */
//
		/* int n=123,rem;
		for(;n>0;n=n/10){
			rem=n%10;
			System.out.print(rem);	
		} */
//using string arguments 
		int n=Integer.parseInt(args[0]); //converting string to int using wrapper class
		for(;n>0;){
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	}
}
