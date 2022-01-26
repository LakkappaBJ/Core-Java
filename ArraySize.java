//to copy the values one array into another array..remaining values are default
class ArraySize{
	public static void main(String args[]){
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		
		int array[]=new int[10];
		array[0]=arr[0];
		array[1]=arr[1];
		array[2]=arr[2];
		array[3]=arr[3];
		array[4]=arr[4];
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}