//prime number using string arguments
class PrimeNumber{
	public static void main(String args[]){
		int count=0;
		int n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(n+" is Prime number");
		}
		else{
			System.out.println(n+" is Not Prime number");
		}
	}
}