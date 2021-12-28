class Factorials{
									//factorial numbers
	static void factNumber(){
		int fact=1;
		for(int num=1;num<=5;num=num+1){
		fact=fact*num;
		}
	System.out.println(fact);
	System.out.println("--------------------------------");
	}
								//factorial series
	static void factSeries(){
		int fact=1;
		for(int num=1;num<=5;num=num+1){
			fact=fact*num;
		System.out.println(num+"!="+fact);  //inside the for loop
		}
		System.out.println("=============================");
	}
									//leap year or not
	static void leapYear(){
		int year=2022;
		if(year%4==0){
			System.out.println("This is Leap year");
		}
		else if(year%100==0){
			System.out.println(year+" Speacified year is Leap year ");
		}
		else if(year%400==0){
			System.out.println(year+ " It is a leap year....");
		}
		else{
			System.out.println(year+ " Specified year is not Leap Year!!!!!");
		}
		System.out.println("--------------------------------");
	}
								//fibonacci series
	static void fibonacci(){
		int num1=0,num2=1;
		System.out.println("Fibonacci numbers are");
		for(int fib=0;fib<=10;fib++){
			System.out.println(num1);
			int value=num1+num2;
			num1=num2;
			num2=value;
		}
	}
	

	public static void main(String[] args){
		factNumber();
		factSeries();
		leapYear();
		fibonacci();
	}
}